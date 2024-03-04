package Recurrsion;

public class allOccurunce {
    public static int[] f(int arr[], int i, int n, int fsf) {
        if (i == arr.length) {
            int[] a = new int[fsf];
            return a;
        }
        if (arr[i] == n) {
            fsf += 1;
            int[] a = f(arr, i + 1, n, fsf);
            a[fsf - 1] = i;
            fsf -= 1;
            return a;
        } else {
            int[] a = f(arr, i + 1, n, fsf);
            return a;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 4, 5, 4 };
        int fsf = 0;
        int a[] = f(arr, 0, 4, fsf);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
