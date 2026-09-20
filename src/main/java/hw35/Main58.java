package hw35;

import java.util.Scanner;

public class Main58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);

        while (number >= 1) {
            number--;
            if (number != 0) {

                System.out.println(number);

            }
        }
    }
}