package com.vanya.homework1.hw3.hwOop;

public class Allinfo {

    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room[] rooms1 = {room1, room2};


        Apartment apartment1 = new Apartment (101, rooms1);
        Apartment [] apartments1 = {apartment1};

        Floor floor1 = new Floor(9, apartments1);
        Floor [] floors = {floor1};

        Home home = new Home(1, floors);

        printAllInformation(home);

    }
    public static void printAllInformation(Home home) {
        home.print();
    }
}
