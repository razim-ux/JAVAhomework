package demo;

public class Demo213 {
    public static void main(String[] args) {

        int n = 100, k;
        double x = 1, s = 0, q = 1;
        for (k = 0; k <= n; k++) {
            s += q;
            q *= x / (k + 1);
        }
        System.out.println("exp("+x+") = "+s);
    }
}
