package org.example;

//Если необходимо, исправьте данный код (задание 2
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class Task2 {

    public static void task2() {
        try {
            int[] intArray = {93, 34, 9, 1628, 415, 842, 1, 46, 1001, 67, 34};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
