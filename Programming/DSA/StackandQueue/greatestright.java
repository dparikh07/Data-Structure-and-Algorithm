package DSA.StackandQueue;

import java.util.*;

public class greatestright {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.size()==0){
                ans[i]=-1;
                st.push(arr[i]);
            }else if(st.peek()>arr[i]){
                ans[i]=st.peek();
                st.push(arr[i]);
            }else if(st.peek()<arr[i]){
                while(st.size()!=0 && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    st.push(arr[i]);
                    ans[i]=-1;
                }else{
                    ans[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
