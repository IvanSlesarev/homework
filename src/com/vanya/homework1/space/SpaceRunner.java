package com.vanya.homework1.space;

public class SpaceRunner {

    public static void main(String[] args) {
        Planet earth = new Planet(5.972e24, 6371);
        Star sun = new Star(1.989e30, 3.828e26);
        Satellite moon = new Satellite(7.34767309e22, earth);
        Asteroid asteroid = new Asteroid(9.5e20);

        System.out.println(earth);
        System.out.println(sun);
        System.out.println(moon);
        System.out.println(asteroid);

        System.out.println("Diameter of Earth: " + earth.calculateDiameter());
        System.out.println("Diameter of Sun: " + sun.calculateDiameter());

        System.out.println("Gravitational Force between Earth and Sun: " + SpaceUtils.calculateGravitationalForce(earth, sun, 1.496e11));

        System.out.println("Is Earth a star? " + SpaceUtils.isStar(earth));
        System.out.println("Is Sun a star? " + SpaceUtils.isStar(sun));

        System.out.println("Mass comparison between Earth and Moon: " + earth.compareMass(moon));
    }
}

