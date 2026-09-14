package hw34;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            System.out.println("двузначное");
        } else {
            System.out.println("не двузначное");
        }
    }
}
