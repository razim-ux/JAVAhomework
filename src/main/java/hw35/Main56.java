package hw35;

import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 0;i <= N; i++) {
            second = first + second;
            first = second - first;
            System.out.println(second);
        }
    }
}
