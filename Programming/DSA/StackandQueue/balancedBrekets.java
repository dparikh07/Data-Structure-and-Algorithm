package DSA.StackandQueue;

import java.util.*;

public class balancedBrekets {
    public static void main(String args[]){
        
        String a="{([(a+b)]+[(c+d)]}";
        String b="{[(a+b)]+[(c+d)]})";
        String c="{[(a+b)]+[(c+d)]}";
        System.out.println(f(a));
        System.out.println(f(b));
        System.out.println(f(c));
    }

    private static boolean f(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }else if(ch=='}'){
                if( st.size()!=0 && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch==']'){
                if(st.size()!=0 && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch==')'){
                if(st.size()!=0 && st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.size()==0){
        return true;
        }else{
        return false;
        }
    }
}
