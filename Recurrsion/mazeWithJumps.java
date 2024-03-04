package Recurrsion;

import java.util.ArrayList;

public class mazeWithJumps {
    public static ArrayList<String> f(int sc, int sr, int dc, int dr) {
        if (sc == dc && sr == dr) {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> hpaths = f(sc, sr + i, dc, dr);
            for (String y : hpaths) {
                paths.add("h" + i + y);
            }
        }
        for (int j = 1; j <= dc - sc; j++) {
            ArrayList<String> vpaths = f(sc + j, sr, dc, dr);
            for (String y : vpaths) {
                paths.add("v" + j + y);
            }
        }
        for (int k = 1; k <= dc - sc && k <= dr - sr; k++) {
            ArrayList<String> dpaths = f(sc + k, sr + k, dc, dr);
            for (String y : dpaths) {
                paths.add("v" + k + y);
            }
        }
        return paths;
    }

    public static void main(String args[]) {
        int sc = 0;
        int sr = 0;
        int dc = 2;
        int dr = 2;
        ArrayList<String> paths = f(sc, sr, dc, dr);
        System.out.println(paths);
    }
}
