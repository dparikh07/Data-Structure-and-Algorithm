package DSA.TimeandSpace;

import java.util.Scanner;

public class partioning {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr= getarray();
        int n=sc.nextInt();
        int[] ans=partition(n,arr);
        display(ans);
    }
    private static int[] partition(int p, int[] a) {
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=p){
                swap(a,i,j);
                j++;
            }
        }
        System.out.println();
        int[] ans=new int[a.length+1];
       for(int i=0;i<ans.length;i++){
        if(i<j){
            ans[i]=a[i];
        }else if(i==j){
            ans[i]=p;
        }else{
            ans[i]=a[i-1];
        }
       }
        return ans;
    }
    private static void display(int[] ans) {
        int n=ans.length;
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    private static int[] getarray() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}

