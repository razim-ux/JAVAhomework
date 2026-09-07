package hw1;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        int numberOpen = number;
        number = number << n;
        System.out.println(number);
        number = numberOpen >> n;
        System.out.println(number);
    }

}
