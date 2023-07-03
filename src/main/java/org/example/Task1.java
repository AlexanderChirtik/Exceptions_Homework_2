package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

   // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static float inputValue() {

        System.out.println("Введите дробное число (разделительный знак - запятая)");
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextFloat();
        System.out.println("Вы ввели: " + value);
        return value;
    }

    public static float valueCheck() {
        try {
            inputValue();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не дробное число");
            valueCheck();
        }
        return 0;
    }


}
