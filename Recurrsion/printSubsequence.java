package Recurrsion;

import java.util.ArrayList;

public class printSubsequence {
    public static void f(String q, String a) {
        if (q.length() == 0) {
            System.out.println(a);
            return;
        }
        String s1 = q.substring(0, 1);
        String s2 = q.substring(1);
        f(s2, a + s1);
        f(s2, a + "");
    }

    public static void main(String args[]) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        String str = "abc";
        f(str, "");
    }
}
