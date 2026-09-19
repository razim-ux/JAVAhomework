package hw35;

import java.util.Scanner;
//Тут я в яндексе вбил и все таки с Алисой поработал.
// Я сначала даже математически что нужно сделать не понял, то есть как должен выглядеть код

public class Main53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(N + "! = " + factorial);
    }
}
