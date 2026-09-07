package hw1;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
