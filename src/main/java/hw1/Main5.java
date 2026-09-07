package hw1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        number = number << 1;
        String binary2 = Integer.toBinaryString(number);
        System.out.println(binary2);
    }

}
