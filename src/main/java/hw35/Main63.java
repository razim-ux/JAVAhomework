package hw35;

import java.util.Scanner;

public class Main63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String secret = "1234";

        do {
            input = scanner.next();
        }
        while (!input.equals(secret));
        System.out.println("доступ разрешен");
    }

}