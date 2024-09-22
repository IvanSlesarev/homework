package com.vanya.homework1.hw4;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {
    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace("ddd", "").toUpperCase().replace(" ", "");

    }

}
