package com.bepositive.assign3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string :-");
        String str = s.nextLine();
        String ans = replace(str);
        System.out.println(ans);

    }
    public static String replace(String s){
        String str = (s);
        s ="";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                char c = str.charAt(i);
                int n =(int)c + 1;
                c = (char)n;
                s += c;
            }else {
                char c = str.charAt(i);
                int n =(int)c - 1;
                c = (char)n;
                s += c;
            }
        }
        return s;
    }
}

