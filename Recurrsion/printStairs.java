package Recurrsion;

public class printStairs {
    public static void f(int q, String a) {
        if (q == 0) {
            System.out.println(a);
            return;
        } else if (q < 0) {
            return;
        }
        f(q - 1, "1" + a);
        f(q - 2, "2" + a);
        f(q - 3, "3" + a);
    }

    public static void main(String args[]) {
        f(3, "");
    }
}
