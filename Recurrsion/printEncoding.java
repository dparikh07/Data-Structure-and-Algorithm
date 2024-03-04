package Recurrsion;

public class printEncoding {
    public static void f(String q, String a) {
        if (q.length() == 0) {
            System.out.println(a);
            return;
        } else if (q.charAt(0) - '0' == 0) {
            return;
        }
        int i1 = (q.charAt(0) - '0');
        f(q.substring(1), a + s[i1]);
        if (q.length() > 1) {
            int i2 = q.charAt(1) - '0';
            int ni = 10 * i1 + i2;
            if (ni < 27) {
                f(q.substring(2), a + s[ni]);
            }
        }
    }

    static String[] s = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s",
            "t", "u", "v", "w", "x", "y", "z" };

    public static void main(String args[]) {
        f("06", "");
    }
}
