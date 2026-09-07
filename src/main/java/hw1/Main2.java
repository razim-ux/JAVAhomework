package hw1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;

        int sum = first + second + third;
        System.out.println(sum);


    }

}
