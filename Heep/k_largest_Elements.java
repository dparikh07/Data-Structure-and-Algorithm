package Heep;

import java.util.Collections;
import java.util.PriorityQueue;

public class k_largest_Elements {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] a = { 3, 1, 2, 5, 4, 6, 7 };
        int n = 3;
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
