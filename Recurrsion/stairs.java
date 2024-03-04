package Recurrsion;

import java.util.ArrayList;

public class stairs {
    public static ArrayList<String> f(int n, int m) {
        if (n == 0) {
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        if (n - 1 >= 0) {
            a = f(n - 1, 0);
        }
        if (n - 2 >= 0) {
            b = f(n - 2, 0);
        }
        if (n - 3 >= 0) {
            c = f(n - 3, 0);
        }
        ArrayList<String> paths = new ArrayList<String>();
        for (String i : a) {
            paths.add(1 + i);
        }
        for (String i : b) {
            paths.add(2 + i);
        }
        for (String i : c) {
            paths.add(3 + i);
        }
        return paths;
    }

    public static void main(String args[]) {
        int n = 4;
        ArrayList<String> l = f(n, 0);
        System.out.println(l);
    }
}
