package hw35;

public class Main69 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 13, 22, 5, 8};
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count += 1;
            }
        }
        System.out.print(count);
    }
}
