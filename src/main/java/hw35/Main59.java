package hw35;

import java.util.Scanner;

public class Main59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while(number>0 ){
            int i = number%10;
            sum+=i;
            number=number/10;
        }
        System.out.println(sum);
    }
}
