package com.vanya.homework1.hw3.hwOop;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Этаж " + number + ", количество квартир " + apartments.length);
        for (Apartment apartment : apartments) {
            apartment.print();
        }
    }
}
