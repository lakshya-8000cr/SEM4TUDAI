package AARYAPAAR;

import java.util.*;

/*
QUESTION:
Check if a string containing brackets is balanced.

Example:
Input: "{[()]}"
Output: true

Input: "{[(])}"
Output: false

Test Case:
System.out.println(balancedString("{[()]}")); // true
*/

class Result {
    static boolean Balancedparen(String s) {


        boolean yes = false;
;        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
               continue;
            }
            if(ch=='[' || ch == '{' ||  ch=='('){
                st.push(ch);
            }
            if(st.isEmpty()){
                yes = true;
            }
            else if(ch==']' && st.peek()=='['){
                st.pop();
            }
            else if(ch==')' && st.peek()=='('){
                st.pop();
            }
            else if(ch=='}' && st.peek()=='{'){
                st.pop();
            }
        }
 
        if(!st.isEmpty()){
            yes = true;
        }

        if(!yes){
            System.out.print("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }

        return false;
    }
}
