package com.vanya.homework1;

import java.util.Scanner;

public class Task1 {
    /**
     * В переменной minutes лежит число от 0 до 59.
     * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
     * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
     * <p>
     * Протестировать функцию в main.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input minutes between 0 and 59:");
        int minutes = scanner.nextInt();
        if (0 <= minutes && minutes <= 14) {
            System.out.println("First part: " + minutes);
        } else if (15 <= minutes && minutes <= 29) {
            System.out.println("Second part: " + minutes);
        } else if (30 <= minutes && minutes <= 44) {
            System.out.println("Third part: " + minutes);
        } else if (45 <= minutes && minutes <= 59) {
            System.out.println("Fourth part: " + minutes);
        } else {
            System.out.println("Invalid part: " + minutes);
        }
    }
}
