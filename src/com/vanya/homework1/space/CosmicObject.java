package com.vanya.homework1.space;

    interface CosmicObject {
        double getMass();
        double calculateDiameter();
        boolean isStar();
    }

    abstract class MassObject implements CosmicObject {
        protected double mass;

        public MassObject(double mass) {
            this.mass = mass;
        }

        @Override
        public double getMass() {
            return mass;
        }

        public double compareMass(CosmicObject other) {
            return this.mass - other.getMass();
        }

        @Override
        public String toString() {
            return "MassObject with mass: " + mass;
        }
    }
