package com.vanya.homework1.bankomat;

public class Bankomat {

    private int amount10;
    private int amount20;
    private int amount50;

    public Bankomat(int amount10, int amount20, int amount50) {
        this.amount10 = amount10;
        this.amount20 = amount20;
        this.amount50 = amount50;
    }

    public boolean isCashWithdrawal(int sum) {
        int muchBanknot10 = amount10;
        int muchBanknot20 = amount20;
        int muchBanknot50 = amount50;

        int banknote10 = 10;
        int banknote20 = 20;
        int banknote50 = 50;

        int sumMoneyInBankomat = muchBanknot10 * banknote10 + muchBanknot20 * banknote20 + muchBanknot50 * banknote50;

        int countBanknote50 = 0;
        int countBanknote10 = 0;
        int countBanknote20 = 0;

        if (sum <= 0 || sum > sumMoneyInBankomat || sum % 10 != 0) {
            return false;

        } else {
            while (sum >= banknote50 && muchBanknot50 > 0) {
                sum -= banknote50;
                muchBanknot50--;
                countBanknote50++;
            }
            System.out.println("Вам выдано купюрами по 50: " + countBanknote50 * banknote50);

            while (sum >= banknote20 && muchBanknot20 > 0) {
                sum -= banknote20;
                muchBanknot20--;
                countBanknote20++;
            }
            System.out.println("Вам выдано купюрами по 20: " + countBanknote20 * banknote20);

            while (sum >= banknote10 && muchBanknot10 > 0) {
                sum -= banknote10;
                muchBanknot10--;
                countBanknote10++;
            }
            System.out.println("Вам выдано купюрами по 10: " + countBanknote10 * banknote10);

            int totalSum = countBanknote10 * banknote10 + countBanknote20 * banknote20 + countBanknote50 * banknote50;

            if (sum == 0) {
                System.out.println(" Выдана сумма наличными: " + totalSum);
            }
            return true;
        }


    }

    public int addBanknote10(int amount) {
        return amount10 += amount;

    }

    public int addBanknote20(int amount) {
        return amount20 += amount;

    }

    public int addBanknote50(int amount) {
        return amount50 += amount;
    }

}
