package Recurrsion;

import java.util.Scanner;

public class firstIndexOccurunce {
    public static int f(int arr[], int i, int n) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == n) {
            return i;
        } else {
            return f(arr, i + 1, n);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 5, 2, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = f(arr, 0, n);
        System.out.print(a);
    }
}
