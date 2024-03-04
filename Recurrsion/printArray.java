package Recurrsion;

public class printArray {
    public static void f(int arr[], int n) {
        if (n < 0) {
            return;
        }
        f(arr, n - 1);
        System.out.println(arr[n]);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        f(arr, arr.length - 1);
    }
}
