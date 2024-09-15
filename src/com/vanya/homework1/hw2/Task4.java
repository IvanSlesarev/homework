package com.vanya.homework1.hw2;

    /**
     * Дан одномерный массив целых чисел.
     * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
     * После удаления - умножить каждый элемент массива на его длину.
     * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
     */

    public class Task4 {

        public static void main(String[] args) {
            int[] originalArray = {3, 5, -6, 3, 2, -9, 0, -123};
            int[] finalArray = processArray(originalArray);
            for (int num : finalArray) {
                System.out.print(num + " ");
            }
        }

        public static int findPositives(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num >= 0) {
                    count++;
                }
            }
            return count;
        }

        public static int[] removeNegatives(int[] array) {
            int count = findPositives(array);
            int[] positiveArray = new int[count];
            int index = 0;
            for (int num : array) {
                if (num >= 0) {
                    positiveArray[index++] = num;
                }
            }
            return positiveArray;
        }

        public static int[] multiplyByLength(int[] arr) {
            int length = arr.length;
            int[] resultArray = new int[length];
            for (int i = 0; i < length; i++) {
                resultArray[i] = arr[i] * length;
            }
            return resultArray;
        }

        public static int[] processArray(int[] arr) {
            int[] positiveArray = removeNegatives(arr);
            return multiplyByLength(positiveArray);
        }

    }

