package Array;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int j = 0; j < n2; j++) {
            arr2[j] = scn.nextInt();
        }
        int max = arr1.length;
        int max2 = arr1.length;
        if (max < arr2.length) {
            max = arr2.length;
            max2 = arr2.length;
        }
        int[] arr = new int[max];
        int c = 0;
        for (int k = max; k > 0; k--) {

            if (n1 > 0 && n2 > 0) {
                int sum = arr1[n1 - 1] + arr2[n2 - 1] + c;
                int digit = sum % 10;
                c = sum / 10;
                arr[max - 1] = digit;
                n1 -= 1;
                n2 -= 1;
                max -= 1;
            } else if (n1 > 0 && n2 <= 0) {
                arr[max - 1] = arr1[n1 - 1] + c;
                n1 -= 1;
                max -= 1;
            } else {
                arr[max - 1] = arr2[n2 - 1] + c;
                n2 -= 1;
                max -= 1;
            }
        }
        for (int z = 0; z < max2; z++) {
            System.out.print(arr[z] + " ");
        }
    }
}
