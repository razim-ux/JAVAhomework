package hw2;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = number > 0 ? "положительное" : number < 0 ? "отрицательное" : "ноль";

        System.out.println(result);
    }

}
