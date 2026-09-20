package hw35;

public class Main68 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 19};
        int max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
