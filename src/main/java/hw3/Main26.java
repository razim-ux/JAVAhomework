package hw3;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}