package hw2;

import java.util.Scanner;
//Сначала сделал как смог с циклом(потому что подобное видел уже ) второй метод уже как понял правильно по заданию
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner.nextInt();

        String check = number1 % 2 == 0 ? "четное" : "нечетное";
        System.out.println(check);
    }
}
