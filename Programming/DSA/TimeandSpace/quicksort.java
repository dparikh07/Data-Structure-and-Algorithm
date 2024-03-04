package DSA.TimeandSpace;

import java.util.Scanner;

public class quicksort {
    public static int partition(int p, int[] a,int low, int high) {
        int j=low;
        for(int i=low;i<=high;i++){
            if(a[i]<=p){
                swap(a,i,j);
                j++;
            }
        }
        return j;
    }
    public static void display(int[] ans) {
        int n=ans.length;
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int[] getarray() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void quick(int[] arr,int low, int high) {
        if(low>=high){
            return;
        }
        int p=arr[high];
        int j=partition(p,arr,low,high);
        quick(arr,low,j-1);
        quick(arr,j+1,high);
    }
    public static void main(String args[]){
        int arr[]=getarray();
        quick(arr,0,arr.length-1);
        display(arr);
    }
}
