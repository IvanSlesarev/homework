package com.vanya.homework1.support;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class SupportServiceEmulator {
    private static final String LOG_FILE_PATH = "complaints.log";
    private static final String CALL_LOG_FILE_PATH = "call_log.log";
    private static final int CHECK_INTERVAL_MS = 120000;

    public static void main(String[] args) {
        ComplaintProcessor complaintProcessor = new ComplaintProcessor();
        CallLogger callLogger = new CallLogger(CALL_LOG_FILE_PATH);

        while (true) {
            try {
                List<Complaint> newComplaints = complaintProcessor.readNewComplaints(LOG_FILE_PATH);
                processComplaints(newComplaints, callLogger);
                Thread.sleep(CHECK_INTERVAL_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processComplaints(List<Complaint> complaints, CallLogger callLogger) {
        for (Complaint complaint : complaints) {
            String formattedPhone = PhoneFormatter.formatPhoneNumber(complaint.getClientPhone());
            callLogger.logCall(complaint.getOrderNumber(), formattedPhone);
        }
    }

}
