package com.vanya.homework1.hw1;

/**
 * Задание 2
 * <p>
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {
    public static void main(String[] args) {
        double result = colculateOperation(3, 7, '+');
        System.out.println(result);

    }

    public static double colculateOperation(double operand1, double operand2, char operatrion) {
        double result = 0;

        switch (operatrion) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Invalid number");
                    break;
                } else {
                    result = operand1 / operand2;
                } break;
            case '%':
                result = operand1 % operand2;
        }

        return result;

    }
}
