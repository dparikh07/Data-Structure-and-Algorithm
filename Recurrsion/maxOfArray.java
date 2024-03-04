package Recurrsion;

public class maxOfArray {
    public static int max(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[arr.length - 1];
        }
        int a = max(arr, i + 1);
        if (arr[i] > a) {
            return arr[i];
        } else {
            return a;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 8, 5 };
        System.out.print(max(arr, 0));
    }
}
