package com.vanya.homework1.support;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallLogger {
    private String logFilePath;

    public CallLogger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void logCall(String orderNumber, String phone) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            String callTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
            writer.write(orderNumber + ". " + callTime + ", " + phone);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
