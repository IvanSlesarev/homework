package com.vanya.homework1.crystals;

import java.util.concurrent.atomic.AtomicInteger;

public class Crystal {
    private final AtomicInteger redCrystals = new AtomicInteger(0);
    private final AtomicInteger whiteCrystals = new AtomicInteger(0);

    public void addCrystals(int red, int white) {
        redCrystals.addAndGet(red);
        whiteCrystals.addAndGet(white);
    }

    public int getRedCrystals() {
        return redCrystals.get();
    }

    public int getWhiteCrystals() {
        return whiteCrystals.get();
    }

    public boolean hasEnoughCrystals() {
        return redCrystals.get() >= 500 && whiteCrystals.get() >= 500;
    }

}
