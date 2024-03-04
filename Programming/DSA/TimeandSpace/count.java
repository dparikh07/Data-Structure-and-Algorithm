package DSA.TimeandSpace;

import java.util.Scanner;

    public class count {
    private static int[] getarray() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    private static void display(int[] ans) {
        int n=ans.length;
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr=getarray();
        
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int[] countFreq = new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-min;
            countFreq[diff]+=1;
        }
        for(int i=1;i<countFreq.length;i++){
            countFreq[i]=countFreq[i]+countFreq[i-1];
        }

        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int diff=arr[i]-min;
            ans[countFreq[diff]-1]=arr[i];
            countFreq[diff]-=1;
        }
        display(ans);

    }
}
