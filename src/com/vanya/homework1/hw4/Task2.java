package com.vanya.homework1.hw4;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {

    public static void main(String[] args) {
        String input = "Привет 8, как 1 2 твои дела? Может4 сделать 3 дело?";
        int[] digits = exctractDigits(input);
        int totalSum = sumOfDigits(digits);
        System.out.println("Сумма чисел из строки: " + totalSum);

    }

    private static int[] exctractDigits(String text) {
        int[] digits = new int[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char number = text.charAt(i);
            if (Character.isDigit(number)) {
                digits[count] = Character.getNumericValue(number);
                count++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(digits, 0, result, 0, count);
        return result;

    }

    private static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

}
