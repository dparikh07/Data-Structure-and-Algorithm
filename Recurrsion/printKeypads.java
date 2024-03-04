package Recurrsion;

public class printKeypads {
    static String[] s = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void f(String n, String a) {
        if (n.length() == 0) {
            System.out.println(a);
            return;
        }
        int n1 = Character.getNumericValue(n.charAt(0));
        String q = n.substring(1);
        for (int i = 0; i < s[n1].length(); i++) {
            char f = s[n1].charAt(i);
            f(q, a + f);
        }
    }

    public static void main(String args[]) {
        String n = "678";
        f(n, "");
    }
}
