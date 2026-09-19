package hw35;

import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        int secret = 42;

        while (guess != secret) {
            if (guess < secret) {
                System.out.println("меньше");
                break;
            } else if (guess > secret) {
                System.out.println("больше");
                break;
            }
        }
        if (guess == secret) {
            System.out.println("угадал");
        }
    }
}
