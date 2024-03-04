package Recurrsion;

import java.util.ArrayList;

public class keypadCombination {
    public static ArrayList<String> f(String[] s, int n) {
        if (n - 10 < 0) {
            ArrayList<String> bstr = new ArrayList<>();
            for (int i = 0; i < s[n].length(); i++) {
                bstr.add(s[n].substring(i, i + 1));
            }
            return bstr;
        }
        int n1 = n / 10;
        String s1 = s[n % 10];
        ArrayList<String> str = f(s, n1);
        ArrayList<String> nstr = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            for (String a : str) {
                nstr.add(a + s1.substring(i, i + 1));
            }
        }
        return nstr;
    }

    public static void main(String args[]) {
        String[] s = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        int n = 678;
        ArrayList<String> a = f(s, n);
        System.out.print(a);
    }
}
