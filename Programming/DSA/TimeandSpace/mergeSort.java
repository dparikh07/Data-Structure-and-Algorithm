package DSA.TimeandSpace;
import java.util.Scanner;
public class mergeSort {
    public static void main(String args[]){
        int[] arr=getarray();
        int[] ans=meargeSort(arr,0,arr.length-1);
        display(ans);
    }
    private static int[] meargeSort(int[] arr,int i,int j) {
        if(i==j){
            int[] ans=new int[1];
            ans[0]=arr[i];
            return ans;
        }
        int mid=(i+j)/2;
        int FirstHalf[]=meargeSort(arr,i,mid);
        int SecondHalf[]=meargeSort(arr,mid+1,j);
        int ans[]=merge(FirstHalf,SecondHalf);
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

}
