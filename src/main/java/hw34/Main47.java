package hw34;

import java.util.Scanner;

public class Main47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int drink = scanner.nextInt();

        switch (drink) {
            case 1:
                System.out.println("Чай " + 50 + " руб");
                break;
            case 2:
                System.out.println("Кофе " + 100 + " руб");
                break;
            case 3:
                System.out.println("Сок " + 150 + " руб");
                break;
            case 4:
                System.out.println("Вода " + 40 + " руб");
                break;
            default:
                System.out.println("Напиток не найден");
        }
    }
}