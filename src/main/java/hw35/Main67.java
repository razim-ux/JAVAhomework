package hw35;

public class Main67 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4};
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}



