package hw2;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
