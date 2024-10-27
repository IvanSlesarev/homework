package com.vanya.homework1.crystals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CrystalRace {
    public static void main(String[] args) {
        Crystal crystal = new Crystal();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Mage("Маг огня", crystal));
        executor.execute(new Mage("Маг воздуха", crystal));

        executor.shutdown();
    }
}
