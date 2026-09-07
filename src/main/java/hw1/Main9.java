package hw1;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        if (x > min && x < max) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
