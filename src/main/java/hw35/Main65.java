package hw35;

import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число от 1 до 100");

        do {
            number = scanner.nextInt();
        }
        while (number < 1 || number > 100);
        System.out.println(number);
    }
}
