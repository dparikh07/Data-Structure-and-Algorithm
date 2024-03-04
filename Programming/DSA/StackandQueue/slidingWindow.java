package DSA.StackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class slidingWindow {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        int[] gr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                gr[i]=-1;
                st.push(i);
            }
            else{
                while(st.size()!=0 && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    gr[i]=-1;
                    st.push(i);
                }else{
                    gr[i]=st.peek();
                    st.push(i);
                }
            }
        }
        int[] ans =new int[n];
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j<i+k){
                if(gr[j]>i+k || gr[j]==-1){
                    ans[i]=arr[j];
                    break;
                }else{
                    j=gr[j];
                }
            }
        }
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
