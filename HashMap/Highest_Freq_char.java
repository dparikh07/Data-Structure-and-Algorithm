package HashMap;

import java.util.HashMap;

public class Highest_Freq_char {
    public static void main(String args[]) {
        String s = "Dhaval parikh";
        HashMap<Character, Integer> hm = new HashMap<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int count = hm.get(s.charAt(i));
                count++;
                hm.put(s.charAt(i), count);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        int max = 0;
        char maxchar = ' ';
        for (Character c : hm.keySet()) {
            if (hm.get(c) > max) {
                max = hm.get(c);
                maxchar = c;
            }
        }
        System.out.print(maxchar);
    }
}
