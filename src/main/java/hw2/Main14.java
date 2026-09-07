package hw2;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int absolute = number >= 0 ? number : -number;
        System.out.println(absolute);
    }
}
