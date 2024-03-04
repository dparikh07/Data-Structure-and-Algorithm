package String;

public class togglecase {
    public static void main(String args[]) {
        StringBuilder s = new StringBuilder("abcDeF");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                char up = (char) ('A' + c - 'a');
                s.setCharAt(i, up);
            } else {
                char sm = (char) ('a' + c - 'A');
                s.setCharAt(i, sm);
            }
        }
        System.out.print(s);
    }
}
