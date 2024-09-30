package com.vanya.homework1.space;

    class Star extends MassObject {
        private double luminosity;

        public Star(double mass, double luminosity) {
            super(mass);
            this.luminosity = luminosity;
        }

        @Override
        public double calculateDiameter() {
            return Math.pow(luminosity, 0.5); // Условная формула для диаметра
        }

        @Override
        public boolean isStar() {
            return true;
        }

        @Override
        public String toString() {
            return "Star with mass: " + mass + ", luminosity: " + luminosity;
        }
    }
