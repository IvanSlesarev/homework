package com.vanya.homework1;

public class Task3 {
    public static void main(String[] args) {
        double firstTriangle = findTriangleS(5, 60);
        System.out.println(firstTriangle);

        double secondTriangle = findTriangleS(8, 15);
        System.out.println(secondTriangle);

        compareTriangleS(firstTriangle, secondTriangle);

    }

    public static double findTriangleS(double a, double b) {
        return (a * b / 2);
    }

    public static void compareTriangleS(double firstTriangle, double secondTriangle) {
        if (firstTriangle > secondTriangle) {
            System.out.println("First triangle area larger than second triangle");
        } else if (firstTriangle < secondTriangle) {
            System.out.println("Second triangle area larger than first triangle");
        } else {
            System.out.println("First triangle area larger than second triangle");
        }
    }
}
