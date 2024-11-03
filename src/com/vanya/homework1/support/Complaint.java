package com.vanya.homework1.support;

public class Complaint {
    private String orderNumber;
    private String callTime;
    private String clientName;
    private String clientPhone;
    private String complaintText;

    public Complaint(String orderNumber, String callTime, String clientName, String clientPhone, String complaintText) {
        this.orderNumber = orderNumber;
        this.callTime = callTime;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.complaintText = complaintText;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCallTime() {
        return callTime;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public String getComplaintText() {
        return complaintText;
    }
}
