package com.vanya.homework1.space;

class Asteroid extends MassObject {

    public Asteroid(double mass) {
        super(mass);
    }

    @Override
    public double calculateDiameter() {
        return Math.cbrt(mass) * 10; // Условная формула для диаметра
    }

    @Override
    public boolean isStar() {
        return false;
    }

    @Override
    public String toString() {
        return "Asteroid with mass: " + mass;
    }
}
