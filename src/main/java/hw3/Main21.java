package hw3;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный");
        } else  {
            System.out.println("не высокосный");
        }
    }
}

