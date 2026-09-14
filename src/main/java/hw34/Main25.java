package hw34;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String login = scanner.nextLine();
        String pass = scanner.nextLine();

        if(login.equals("admin") && pass.equals(1234) || login.equals("user") && pass.equals(1111)){
            System.out.println("вход выполнен");
        }else {
            System.out.println("вход запрещен");
        }
    }
}