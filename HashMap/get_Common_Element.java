package HashMap;

import java.util.HashMap;

public class get_Common_Element {
    public static void main(String args[]) {
        int a1[] = { 0, 1, 4, 2, 3, 5, 1, 4 };
        int a2[] = { 1, 3, 5, 7, 9, 0, 5, 3, 4 };

        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            hm1.put(a1[i], 1);
        }
        // for (int j = 0; j < a2.length; j++) {
        // hm2.put(a2[j], 1);
        // }
        for (int i = 0; i < a2.length; i++) {
            int val = a2[i];
            if (hm1.containsKey(val) && hm1.get(val) != -1) {
                System.out.println(val);
                hm1.put(val, -1);
            }
        }
    }
}
