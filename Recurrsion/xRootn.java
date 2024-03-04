package Recurrsion;

public class xRootn {
    public static int f(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            int a = f(x, n / 2) * f(x, n / 2);
            return a;
        } else {
            int a = f(x, n / 2) * f(x, n / 2) * x;
            return a;
        }
    }

    public static void main(String args[]) {
        int x = 5;
        int n = 3;
        System.out.print(f(x, n));
    }

}
