package org.example;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static String trackingEmptyLines() {
        System.out.println("Введите информацию");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        else
            System.out.println(str);
        return str;
    }
}

