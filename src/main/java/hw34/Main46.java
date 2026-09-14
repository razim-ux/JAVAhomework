package hw34;

import java.util.Scanner;
// Решения так и не нашел, попытался и так и так, как реализовать все таки не понял.

public class Main46 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int score1 = scanner1.nextInt();

        switch (score1) {
            case 90 - 100:
                System.out.println("Отлично");
                break;
            case 2:
                if (score1 >= 75 && score1 <= 90) {
                    System.out.println("Хорошо");
                }
                break;
            case 3:
                if (score1 >= 60 && score1 <= 74) {
                    System.out.println("Удовл.");
                    break;
                }
            case 4:
                if (score1 >= 0 && score1 <= 59) {
                    System.out.println("Неудовл.");
                    break;
                }
            default:
                System.out.println("Не верные данные");
        }

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch (score) {
            case 9, 10:
                if (score / 10 == 10 && score / 10 == 9) {
                    System.out.println("Отлично");
                }
                break;
            case 8, 7:
                if (score / 10 == 8 && score / 10 == 7) {
                    System.out.println(score);
                    System.out.println("Хорошо");
                }
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
                System.out.println("Не верные данные");
        }
    }
}
