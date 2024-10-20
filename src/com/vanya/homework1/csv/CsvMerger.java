package com.vanya.homework1.csv;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CsvMerger {
    public static void main(String[] args) {
        String itemsPriceFile = "resources/items-price.csv";
        String itemsNameFile = "resources/items-name.csv";
        String resultFile = "resources/result.csv";
        String errorsFile = "resources/errors.csv";

        Map<String, String> priceMap = new HashMap<>();
        Map<String, String> nameMap = new HashMap<>();

        try (BufferedReader priceReader = new BufferedReader(new FileReader(itemsPriceFile))) {
            String line;
            priceReader.readLine();
            while ((line = priceReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    priceMap.put(parts[0].trim(), parts[1].trim()); // ID, PRICE
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла " + itemsPriceFile + ": " + e.getMessage());
        }

        try (BufferedReader nameReader = new BufferedReader(new FileReader(itemsNameFile))) {
            String line;
            nameReader.readLine();
            while ((line = nameReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    nameMap.put(parts[0].trim(), parts[1].trim()); // ID, NAME
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла " + itemsNameFile + ": " + e.getMessage());
        }

        try (BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFile));
             BufferedWriter errorsWriter = new BufferedWriter(new FileWriter(errorsFile))) {

            resultWriter.write("ID,NAME,PRICE");
            resultWriter.newLine();

            for (String id : priceMap.keySet()) {
                if (nameMap.containsKey(id)) {
                    String resultLine = id + "," + nameMap.get(id) + "," + priceMap.get(id);
                    resultWriter.write(resultLine);
                    resultWriter.newLine();
                } else {
                    errorsWriter.write(id);
                    errorsWriter.newLine();
                }
            }

            for (String id : nameMap.keySet()) {
                if (!priceMap.containsKey(id)) {
                    errorsWriter.write(id);
                    errorsWriter.newLine();
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка записи в файлы: " + e.getMessage());
        }
    }
}
