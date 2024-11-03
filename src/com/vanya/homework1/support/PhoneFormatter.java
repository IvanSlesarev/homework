package com.vanya.homework1.support;

public class PhoneFormatter {

    public static String formatPhoneNumber(String phone) {
        String digits = phone.replaceAll("\\d", "");

        if (digits.length() == 12 && digits.startsWith("375")) {
            return "+375 (" + digits.substring(4, 6) + ") " + digits.substring(6, 9) + "-" + digits.substring(9, 11) + "-" + digits.substring(11, 13);
        } else if (digits.length() == 9 && digits.startsWith("29")) {
            return "+375 (" + digits.substring(0, 2) + ") " + digits.substring(2, 5) + "-" + digits.substring(5, 7) + "-" + digits.substring(7, 9);
        }
        return phone;
    }
}



