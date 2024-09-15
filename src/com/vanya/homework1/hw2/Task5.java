package com.vanya.homework1.hw2;

    /**
     * Дан одномерный массив символов.
     * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
     * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
     * <p>
     * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
     */
    public class Task5 {

        public static void main(String[] args) {

            char[] charArray = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
            int[] intArray = new int[charArray.length];

            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = charArray[i];
            }

            double average = calculateAverage(intArray);
            System.out.println("More than average : " + average);
            for (int number : intArray) {
                if (number > average) {
                    System.out.printf("%d ", number);
                }
            }
        }

        private static double calculateAverage(int[] array) {
            int sum = 0;
            for (int number : array) {
                sum += number;
            }
            return (double) sum / array.length;
        }

    }

