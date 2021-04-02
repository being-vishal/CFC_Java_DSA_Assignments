package com.bepositive.practise;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> st = new Stack();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(st.empty()){
                st.push(c);
            }else if(st.peek() == '(' && c == ')'){
                st.pop();
            }else if(st.peek() == '{' && c == '}'){
                st.pop();
            }else if(st.peek() == '[' && c == ']'){
                st.pop();
            }else{
                st.push(c);
            }

        }

        if(st.empty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
