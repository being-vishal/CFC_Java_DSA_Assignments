package com.bepositive.practise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

//        Sample_input = {[(a+b)+((c=d))]}
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size()==0){
                    System.out.println("Not Balanced");
                    return;
                }else if (st.peek() != '('){
                    System.out.println("Not Balanced");
                    return;
                }else{
                    st.pop();
                }
            }else if(ch == '}'){
                if(st.size()==0){
                    System.out.println("Not Balanced");
                    return;
                }else if (st.peek() != '{'){
                    System.out.println("Not Balanced");
                    return;
                }else{
                    st.pop();
                }
            }else if(ch == ']'){
                if(st.size()==0){
                    System.out.println("Not Balanced");
                    return;
                }else if (st.peek() != '['){
                    System.out.println("Not Balanced");
                    return;
                }else{
                    st.pop();
                }
            }
        }
        System.out.println("Balanced");
    }
}
