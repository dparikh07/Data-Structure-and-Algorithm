package HashMap;

import java.util.HashMap;

public class longest_consecutive_sequence {
    public static void main(String args[]) {
        int[] a = { 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], 1);
        }
        for (int i = 0; i < a.length; i++) {
            if (hm.get(a[i]) > 0) {
                int val = a[i];
                int count = 1;
                while (hm.containsKey(val + 1)) {
                    count++;
                    hm.put(a[i], count);
                    hm.put(val + 1, -1);
                    val++;
                }
            }
        }

        int max = 0;
        int val = -1;
        for (Integer i : hm.keySet()) {
            if (hm.get(i) > max) {
                max = hm.get(i);
                val = i;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(val + " ");
            val++;
        }

    }
}
