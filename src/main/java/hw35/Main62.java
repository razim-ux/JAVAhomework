package hw35;

import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int power = 1;

        while (power*2<=N){
           power*=2;
        }
        System.out.println(power);
    }
}
