package com.vanya.homework1.crystals;

import java.util.Random;

public class Mage implements Runnable {
    private final String name;
    private final Crystal crystal;
    private final Random random = new Random();

    public Mage(String name, Crystal crystal) {
        this.name = name;
        this.crystal = crystal;
    }

    @Override
    public void run() {
        while (!crystal.hasEnoughCrystals()) {

            int red = random.nextInt(4) + 2;
            int white = random.nextInt(4) + 2;
            crystal.addCrystals(red, white);
            System.out.println(name + " собрал " + red + " красных и " + white + " белых кристаллов.");

            int crystalsToSend = random.nextInt(4) + 2;
            if (crystal.getRedCrystals() > 0 || crystal.getWhiteCrystals() > 0) {
                System.out.println(name + " отправляет ракету с " + crystalsToSend + " кристаллами.");

            } else {
                System.out.println(name + " отправляет пустую ракету.");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " выиграл!");
    }
}

