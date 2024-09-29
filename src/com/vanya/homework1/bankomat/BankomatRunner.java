package com.vanya.homework1.bankomat;

public class BankomatRunner {
    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat(10, 20, 20);
        boolean result = bankomat.isCashWithdrawal(200);
        System.out.println();
        System.out.println(result);
    }

}
