package com.vanya.homework1.hw2;


/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class Task6 {

    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        int[][] resultArray = splittingArrayCreatingWhole(values);
        printMatrix(resultArray);
    }

    private static int[][] splittingArrayCreatingWhole(int[] array) {
        int positiveElements = 0;
        int negativeElements = 0;
        int zeroElements = 0;

        for (int value : array) {
            if (value > 0) {
                positiveElements++;
            } else if (value < 0) {
                negativeElements++;
            } else {
                zeroElements++;
            }
        }

        int[] positiveArray = new int[positiveElements];
        int[] negativeArray = new int[negativeElements];
        int[] zeroArray = new int[zeroElements];

        int indexPositive = 0;
        int indexNegative = 0;
        int indexZero = 0;

        for (int value : array) {
            if (value > 0) {
                positiveArray[indexPositive++] = value;
            } else if (value < 0) {
                negativeArray[indexNegative++] = value;
            } else {
                zeroArray[indexZero] = value;
            }
        }
        return new int[][]{negativeArray, zeroArray, positiveArray};
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}