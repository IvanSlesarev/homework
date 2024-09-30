package com.vanya.homework1.space;

class SpaceUtils {

    public static double calculateGravitationalForce(CosmicObject obj1, CosmicObject obj2, double distance) {
        final double G = 6.67430e-11; // Гравитационная постоянная
        return G * (obj1.getMass() * obj2.getMass()) / (distance * distance);
    }

    public static boolean isStar(CosmicObject obj) {
        return obj.isStar();
    }
}
