package hw1;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        number = number << n;
        String binary2 = Integer.toBinaryString(number);
        System.out.println(binary2);
        number = Integer.parseInt(binary2, 2);
        System.out.println(number);
    }

}
