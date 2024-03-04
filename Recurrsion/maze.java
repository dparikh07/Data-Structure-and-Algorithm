package Recurrsion;

import java.util.ArrayList;

public class maze {
    public static ArrayList<String> f(int sc, int sr, int dc, int dr) {
        if (sc == dc && sr == dr) {
            ArrayList<String> v = new ArrayList<>();
            v.add("");
            return v;
        }
        ArrayList<String> r = new ArrayList<>();
        ArrayList<String> v = new ArrayList<>();
        if (sc < dc) {
            v = f(sc + 1, sr, dc, dr);
        }
        if (sr < dr) {
            r = f(sc, sr + 1, dc, dr);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String i : r) {
            paths.add("h" + i);
        }
        for (String j : v) {
            paths.add("v" + j);
        }
        return paths;
    }

    public static void main(String args[]) {
        int sc = 0;
        int sr = 0;
        int dc = 2;
        int dr = 2;
        ArrayList<String> a = f(sc, sr, dc, dr);
        System.out.print(a);
    }
}
