package Recurrsion;

public class printMaze {
    public static void f(int sc, int sr, int dc, int dr, String s) {
        if (sc == dc && sr == dr) {
            System.out.println(s);
            return;
        } else if (sc > dc || sr > dr) {
            return;
        }
        f(sc + 1, sr, dc, dr, s + "v");
        f(sc, sr + 1, dc, dr, s + "h");
    }

    public static void main(String args[]) {
        f(0, 0, 3, 3, "");
    }
}
