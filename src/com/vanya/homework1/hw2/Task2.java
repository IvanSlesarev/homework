package com.vanya.homework1.hw2;


/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {

    public static void main(String[] args) {
        int number1 = 4508;
        int number2 = 4700;
        int number3 = 123456789;

        System.out.println(reverseNumber(number1));
        System.out.println(reverseNumber(number2));
        System.out.println(reverseNumber(number3));

    }

    private static int reverseNumber ( int number ) {
        int revers = 0;
        while (number != 0) {
            int last = number % 10;
            revers = revers * 10 + last;
            number /= 10;

        }

        return revers;
    }

}
