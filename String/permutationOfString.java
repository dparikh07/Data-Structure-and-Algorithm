package String;

public class permutationOfString {
    public static void main(String args[]) {
        String s = "abc";
        int f = 1;
        for (int i = s.length(); i > 0; i--) {
            f *= i;
        }
        for (int j = 0; j < f; j++) {
            StringBuilder sb = new StringBuilder("abc");
            int l = j;
            for (int k = 3; k > 0; k--) {
                int q = l / k;
                int d = l % k;
                System.out.print(sb.charAt(d));
                sb.deleteCharAt(d);
                l = q;
            }
            System.out.println();
        }
    }
}
