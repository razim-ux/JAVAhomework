package hw34;

import java.util.Scanner;
// Решения так и не нашел, попытался и так и так, как реализовать все таки не понял.

public class Main46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        score = score / 10;
        switch (score) {
            case 9, 10:
                System.out.println("Отлично");
                break;
            case 8, 7:
                System.out.println(score);
                System.out.println("Хорошо");
                break;
            case 6:
                if (score / 10 == 6) {
                    System.out.println("Удовл.");
                    break;
                }
            case 5, 4, 3, 2, 1:
                if (score / 10 <= 5) {
                    System.out.println("Неудовл.");
                    break;
                }
            default:
                System.out.println("Не верные данные");//       }
        }
    }
}