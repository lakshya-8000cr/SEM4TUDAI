package AARYAPAAR;

import java.util.*;

/*
QUESTION:
Convert infix expression to postfix expression.

Example:
Input:  "A+B*C"
Output: "ABC*+"
*/

class InfixToPostfix {

    static int priority(char ch){
        if(ch=='+' || ch=='-') return 1;
        else if(ch=='*' || ch=='/')return 2;
        return 0;
    }

    public static  String convert(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans  = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // operand
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }

            // opeinign bracket
            else if(ch=='('){
                st.push(ch);
            }

            //closing bracket
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }

                if(!st.isEmpty()) st.pop();
            }

            //operator
            else {
                while(!st.isEmpty() && priority(st.peek())>=priority(ch)){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // empty bracket
        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args){
        String str = "A+B*C";
        System.out.print(convert(str));
    }
}
