package DSA.StackandQueue;

import java.util.Stack;

public class infix {
    public static void main(String args[]){
        String s="2+(5-3*6/2)";
        Stack<Integer> nst=new Stack<>();
        Stack<Character> cst=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                nst.push(Character.getNumericValue(ch));
            }else if(ch=='('){
                cst.push(ch);
            }else if(ch=='+'){
                while(cst.peek()=='-'){
                    cst.pop();
                    int temp= - nst.pop() + nst.pop();
                    nst.push(temp);
                }
                cst.push(ch);
            }else if(ch=='-'){
                while(cst.peek()=='+'){
                    cst.pop();
                    int temp= nst.pop() + nst.pop();
                    nst.push(temp);
                }
                cst.push(ch);
            }else if(ch=='*'){
                while(cst.peek()=='/'||cst.peek()=='+'||cst.peek()=='-'){
                if(cst.peek()=='/'){
                    cst.pop();
                    int c2=nst.pop();
                    int c1=nst.pop();
                    int temp= c1 / c2;
                    nst.push(temp);

                }else if(cst.peek()=='+'){
                    cst.pop();
                    int c2=nst.pop();
                    int c1=nst.pop();
                    int temp= c1 + c2;
                    nst.push(temp);
                }else if(cst.peek()=='-'){
                    cst.pop();
                    int c2=nst.pop();
                    int c1=nst.pop();
                    int temp= c1 - c2;
                    nst.push(temp);
                }
                }
                cst.push(ch);
            }else if(ch==')'){

            }
        } 
    }
}
