package hw34;

import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);

        switch (symbol) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                System.out.println("цифра");
                break;
            case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                 'U', 'V', 'W', 'X', 'Y', 'Z',
                 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                 'u', 'v', 'w', 'x', 'y', 'z':
                System.out.println("буква");
                break;
            default:
                System.out.println("другое");

        }
    }
}
