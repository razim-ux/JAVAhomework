package hw34;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        double discount = 0.0;

        if (amount < 1000) {
            discount = 0.0;
        } else if (amount >= 1000 && amount < 5000) {
            discount = 5.0;
        } else if (amount >= 5000 && amount < 10000) {
            discount = 10.0;
        } else if (amount >= 10000) {
            discount = 15.0;
        }
        double amountFinal = amount * (1 - discount / 100);
        System.out.println(amountFinal);
    }
}

