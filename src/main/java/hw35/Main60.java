package hw35;

import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reserved;

        while (number>0){
            reserved=number%10;
            number/=10;
            System.out.print(reserved);

        }
    }
}
