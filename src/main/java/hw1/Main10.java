package hw1;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
