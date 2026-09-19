package hw35;

import java.util.Scanner;
//почему именно соут дает последовательно каждый результат я не понял, но решение верное. Сделал сам.

public class Main52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            product = number * i;
            System.out.println(product);
        }
    }
}
