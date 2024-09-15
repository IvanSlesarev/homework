package com.vanya.homework1.hw2;
import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();

        int even = evenNumbers(number);
        int odd = oddNumbers(number);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }

    private static int evenNumbers(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10; //
        }
        return count;
    }


    private static int oddNumbers(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                count++;
            }
            number /= 10;
        }
        return count;

    }
}