package com.bepositive.practise;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

//      Sample_input = (a+b)+((c=d))

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '('){
                    System.out.println("Duplicate brackets present.");
                    return;
                }else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println("NO Duplicate brackets present.");
    }
}
