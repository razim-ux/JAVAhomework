package hw34;

import java.util.Scanner;

public class Main44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String operation = scanner.next();
        char oper = operation.charAt(0);

        switch (oper) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Делитель равен 0 , операция невозможна");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println(" Не выполнили условия");

        }
    }
}