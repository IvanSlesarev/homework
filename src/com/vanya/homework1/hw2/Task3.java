package com.vanya.homework1.hw2;


/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {

    public static void main(String[] args) {
        double startSalary = 600;
        double upSalary = 400;
        int upTime = 6;

        double monthlyExpense = 300;
        double investmentPercent = 0.10;
        double investmentReturn = 0.02;

        int allMonth = 38;

        double totalSavings = calculationSaving( startSalary, upSalary, upTime, monthlyExpense, investmentPercent, investmentReturn, allMonth );
        System.out.println("У Вани будет на счету через 3 года и 2 месяца: " + totalSavings);
    }

    private static double calculationSaving ( double startSalary, double upSalary, int upTime, double monthlyExpense, double investmentPercent, double investmentReturn, int allMonth ) {
        double currentSalary = startSalary;
        double brokerAccount = 0;
        double personalAccount = 0;

        for (int month = 1; month <= allMonth; month++) {
            double investment = currentSalary * investmentPercent;
            brokerAccount += investment;
            brokerAccount *= (1 + investmentReturn);
            personalAccount += (currentSalary - investment - monthlyExpense);

            if (month % upTime == 0) {
                currentSalary += upSalary;
            }
        }

        return personalAccount + brokerAccount;

    }

}

