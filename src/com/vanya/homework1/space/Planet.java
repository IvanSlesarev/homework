package com.vanya.homework1.space;

class Planet extends MassObject {
    private double radius;

    public Planet(double mass, double radius) {
        super(mass);
        this.radius = radius;
    }

    @Override
    public double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public boolean isStar() {
        return false;
    }

    @Override
    public String toString() {
        return "Planet with mass: " + mass + ", radius: " + radius;
    }
}
