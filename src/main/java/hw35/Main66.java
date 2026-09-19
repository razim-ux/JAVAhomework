package hw35;

import java.util.Scanner;

public class Main66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;
        number = scanner.nextInt();

        do {
            number = number / 10;
            count++;
        } while (number != 0);
        System.out.println(count);
    }
}
