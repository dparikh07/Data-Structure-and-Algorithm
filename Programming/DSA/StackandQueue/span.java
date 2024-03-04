package DSA.StackandQueue;

import java.util.*;

public class span {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(arr[i]);
                ans[i]=1;
            }else if(arr[i]<st.peek()){
                ans[i]=1;
                st.push(arr[i]);
            }else if(arr[i]>st.peek()){
                ans[i]=1;
                while(st.size()!=0 && arr[i]>st.peek()){
                    st.pop();
                    ans[i]+=1;
                }
                st.push(arr[i]);
            }
        }
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
