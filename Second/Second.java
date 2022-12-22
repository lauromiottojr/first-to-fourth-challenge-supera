package superachallenge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Second {

    public void secondChallenge() {

        int ballot100 = 0;
        int ballot50 = 0;
        int ballot20 = 0;
        int ballot10 = 0;
        int ballot5 = 0;
        int ballot2 = 0;

        int coin100 = 0;
        int coin050 = 0;
        int coin025 = 0;
        int coin010 = 0;
        int coin005 = 0;
        int coin001 = 0;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira o valor a ser decomposto: ");
        double amount = scan.nextDouble();

        // BALLOTS
        if (amount / 100 >= 1) {
            ballot100 = (int) amount / 100;
            amount = amount - (ballot100 * 100);
        }
        if (amount / 50 >= 1) {
            ballot50 = (int) amount / 50;
            amount = amount - (ballot50 * 50);
        }
        if (amount / 20 >= 1) {
            ballot20 = (int) amount / 20;
            amount = amount - (ballot20 * 20);
        }
        if (amount / 10 >= 1) {
            ballot10 = (int) amount / 10;
            amount = amount - (ballot10 * 10);
        }
        if (amount / 5 >= 1) {
            ballot5 = (int) amount / 5;
            amount = amount - (ballot5 * 5);
        }
        if (amount / 2 >= 1) {
            ballot2 = (int) amount / 2;
            amount = amount - (ballot2 * 2);
        }

        // COINS
        if (amount < 2 && amount >= 1) {
            coin100++;
            amount = amount - coin100;
        }
        if (amount < 1 && amount >= 0.5) {
            coin050++;
            amount = amount - 0.5;
        }
        if (amount < 0.5 && amount >= 0.25) {
            coin025++;
            amount = amount - 0.25;
        }
        if (amount < 0.25 && amount >= 0.2) {
            coin010 = 2;
            amount = amount - 0.2;
        }
        if (amount < 0.2 && amount >= 0.1) {
            coin010++;
            amount = amount - 0.1;
        }
        if (amount < 0.1 && amount >= 0.05) {
            coin005++;
            amount = amount - 0.05;
        }
        BigDecimal bd = new BigDecimal(amount).setScale(3, RoundingMode.HALF_EVEN);
        if (amount < 0.05) {
            double countCoin = bd.doubleValue() * 100;
            coin001 = (int) countCoin;
            amount = amount - (countCoin / 100);
        }

        System.out.println("NOTAS:");
        System.out.println(ballot100 + " nota(s) de R$100.00");
        System.out.println(ballot50 + " nota(s) de R$50.00");
        System.out.println(ballot20 + " nota(s) de R$20.00");
        System.out.println(ballot10 + " nota(s) de R$10.00");
        System.out.println(ballot5 + " nota(s) de R$5.00");
        System.out.println(ballot2 + " nota(s) de R$2.00");

        System.out.println("MOEDAS:");
        System.out.println(coin100 + " moeda(s) de R$1.00");
        System.out.println(coin050 + " moeda(s) de R$0.50");
        System.out.println(coin025 + " moeda(s) de R$0.25");
        System.out.println(coin010 + " moeda(s) de R$0.10");
        System.out.println(coin005 + " moeda(s) de R$0.05");
        System.out.println(coin001 + " moeda(s) de R$0.01");
    }
}
