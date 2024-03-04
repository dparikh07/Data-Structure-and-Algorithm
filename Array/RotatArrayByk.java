package Array;

import java.util.Scanner;

public class RotatArrayByk {
    public static void reverse(int[] a, int i, int j) {
        int d = j - 1 + 1;
        d = d / 2;
        int temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        reverse(a, 0, n - 1 - k);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
        for (int val : a) {
            System.out.print(val);
        }
    }
}
