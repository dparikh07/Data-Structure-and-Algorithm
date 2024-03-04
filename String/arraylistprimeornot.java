package String;

import java.util.ArrayList;
import java.util.List;

public class arraylistprimeornot {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>(List.of(11, 24, 36, 77, 7, 3));
        for (int i = a.size() - 1; i >= 0; i--) {
            int p = 0;
            for (int j = 2; j < Math.sqrt(a.get(i)); j++) {
                if (a.get(i) % j == 0) {
                    p = 1;
                }
            }
            if (p == 0) {
                a.remove(i);
            }
        }

        for (Integer k : a) {
            System.out.print(k + "\t");
        }

    }
}
