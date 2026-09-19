package hw35;

import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);
    }
}
