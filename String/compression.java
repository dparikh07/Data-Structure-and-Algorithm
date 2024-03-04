package String;

public class compression {
    public static void compress1(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            while ((i != s.length() - 1) && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
        }
        System.out.println();
    }

    public static void compress2(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            int c = 1;
            while ((i != s.length() - 1) && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                c++;
            }
            System.out.print(c);
        }
    }

    public static void main(String args[]) {
        String s = "aabbbcddeeef";
        compress1(s);
        compress2(s);
    }
}
