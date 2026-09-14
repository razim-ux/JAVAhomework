package hw34;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 7 == 0) {
            System.out.println("кратно 7");
        } else {
            System.out.println("не кратно 7");
        }
    }
}
