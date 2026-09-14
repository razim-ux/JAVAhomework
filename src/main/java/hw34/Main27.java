package hw34;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0 && number > 0) {
            System.out.println("чётное положительное");
        } else if (number % 2 == 1 && number > 0) {
            System.out.println("нечётное положительное");
        } else if (number < 0) {
            System.out.println("отрицательное");
        } else if (number == 0) {
            System.out.println("ноль");
        }
        ;
    }
}