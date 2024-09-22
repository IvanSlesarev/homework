package com.vanya.homework1.hw3.hwOop;

public class Home {
    private int number;
    private Floor[] floors;

    public Home(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом " + number + ", колчество этажей " + floors.length);
        for (Floor floor : floors) {
            floor.print();
        }
    }

}
