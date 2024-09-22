package com.vanya.homework1.hw3.hwOop;

public class Room {
    private boolean isPassTrough;

    public Room(boolean isPassTrough) {
        this.isPassTrough = isPassTrough;
    }

    public void print() {
        System.out.println("Комната: проходная = " + isPassTrough);
    }
}
