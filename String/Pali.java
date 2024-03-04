package String;

public class Pali {
    public static void main(String args[]) {
        String s = "abcabc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String a = s.substring(i, j);
                int b = 0;
                int c = a.length() - 1;
                while (b <= c) {
                    if (a.charAt(b) != a.charAt(c)) {
                        break;
                    } else {
                        b++;
                        c--;
                    }
                }
                if (b > c) {
                    System.out.println(a);
                }
            }
        }
    }
}
