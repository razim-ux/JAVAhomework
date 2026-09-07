package hw1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 60 / 60;
        int minutes = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " " + minutes + " " + seconds + " ");
    }

}
