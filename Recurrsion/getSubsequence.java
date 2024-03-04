package Recurrsion;

import java.util.ArrayList;

public class getSubsequence {
    public static ArrayList<String> f(String s) {
        if (s.length() == 0) {
            ArrayList<String> bstr = new ArrayList<>();
            bstr.add("");
            return bstr;
        }
        char s1 = s.charAt(0);
        String s2 = s.substring(1);
        ArrayList<String> str = f(s2);
        ArrayList<String> nstr = new ArrayList<>();
        for (String i : str) {
            nstr.add(s1 + i);
            nstr.add("" + i);
        }
        return nstr;
    }

    public static void main(String args[]) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        String str = "abc";
        s = f(str);
        System.out.print(s);
    }
}
