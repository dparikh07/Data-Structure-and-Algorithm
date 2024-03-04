package Array;

import java.util.Scanner;

public class SubArray {
    public static void subarray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        subarray(a);
    }
}
