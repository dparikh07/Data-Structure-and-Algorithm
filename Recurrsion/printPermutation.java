package Recurrsion;

public class printPermutation {
    public static void f(String q, String a) {
        if (q.length() == 0) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            f(q.substring(0, i) + q.substring(i + 1, q.length()), a + ch);
        }
    }

    public static void main(String args[]) {
        f("abc", "");
    }
}
