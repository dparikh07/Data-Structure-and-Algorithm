package Recurrsion;

public class factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n * factorial(n - 1);
        return f;
    }

    public static void main(String args[]) {
        System.out.print(factorial(3));
    }
}
