package DSA.StackandQueue;

import java.util.Stack;

public class duplicateBrackets {
    public static void main(String args[]){
        String a="((a+b)+(c+d))";
        String b="(((a+b))+(c+d))";
        boolean ans1=f(a);
        boolean ans2=f(b);
        System.out.println(ans1+" "+ans2);
    }

    private static boolean f(String a) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==')'){
                if(st.peek()=='('){
                    return true;
                }else{
                    while(st.peek() !='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(a.charAt(i));
            }
        }
        return false;
    }
}
