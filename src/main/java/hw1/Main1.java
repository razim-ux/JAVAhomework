package hw1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(25);
        System.out.println(8);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a/b;
        int result2 = a%b;
        System.out.println(result);
        System.out.println(result2);
    }

}

