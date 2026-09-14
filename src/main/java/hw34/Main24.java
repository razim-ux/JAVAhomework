package hw34;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10 || number >= 50 && number <= 100) {
            System.out.println("попадает");
        } else {
            System.out.println("не попадает");
        }
    }
}
