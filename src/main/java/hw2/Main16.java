package hw2;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a < b ? a : b < c ? b : c;
        System.out.println(min);
    }
}
