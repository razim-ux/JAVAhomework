package demo;

public class Demo211 {
    public static void main(String[] args) {
        int sum = 0, i = 1, n = 100;
        // Оператор цикла:
        do {
            sum += i;
            i += 2;
        } while (i <= n);
        System.out.println(
                "Сумма нечетных чисел от 1 до " + n + ": " + sum
        );
    }
}

