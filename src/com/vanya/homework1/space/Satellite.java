package com.vanya.homework1.space;

class Satellite extends MassObject {
    private Planet orbitingPlanet;

    public Satellite(double mass, Planet orbitingPlanet) {
        super(mass);
        this.orbitingPlanet = orbitingPlanet;
    }

    @Override
    public double calculateDiameter() {
        return Math.sqrt(mass) * 10;
    }

    @Override
    public boolean isStar() {
        return false;
    }

    @Override
    public String toString() {
        return "Satellite with mass: " + mass + " orbiting " + orbitingPlanet.toString();
    }
}