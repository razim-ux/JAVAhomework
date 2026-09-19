package demo;

public class Demo214 {
    public static void main(String[] args) {

        int n = 15, a = 1, b = 1, i;
        System.out.println("Числа Фибоначчи:");
        System.out.println(a + "  " + b);

        for (i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
            System.out.println("  " + b);
        }
    }
}
