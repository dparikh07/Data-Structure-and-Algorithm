package DSA.StackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class greatestArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int[] ls=ls(arr);
        int[] rs=rs(arr);
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=(rs[i]-ls[i]-1)*arr[i];
        }
        int max=ans[0];
        for(int i=0;i<arr.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        System.out.print("The biggest area is "+max);

        
    }

    private static int[] rs(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                st.push(i);
                ans[i]=arr.length;
            }else{
                while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    st.push(i);
                    ans[i]=arr.length;
                }else{
                    ans[i]=st.peek();
                    st.push(i);
                }
            }
        }
        return ans;
    }

    private static int[] ls(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                st.push(i);
                ans[i]=-1;
            }else{
                while(st.size()!=0 && arr[i]<=arr[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    st.push(arr[i]);
                    ans[i]=-1;
                }else{
                    ans[i]=st.peek();
                    st.push(i);
                }
            }
        }
        return ans;
    }
}
