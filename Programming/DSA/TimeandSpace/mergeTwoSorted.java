package DSA.TimeandSpace;
import java.util.Scanner;
public class mergeTwoSorted {
    public static void main(String args[]){
        int[] arr1=getarray();
        int[] arr2=getarray();
        int[] ans=merge(arr1,arr2);
        display(ans);
    }

    private static void display(int[] ans) {
        int n=ans.length;
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] ans=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
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
