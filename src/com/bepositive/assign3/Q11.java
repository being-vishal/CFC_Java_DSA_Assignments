package com.bepositive.assign3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :-");
        String str = sc.nextLine();
        System.out.println(changeCase(str));
    }

    public static String changeCase(String s) {
        String str = s;
        s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = (int)c;
            if(n>96){
                n -= 32;
                c = (char)n;
                s += c;
            } else {
                n += 32;
                c = (char)n;
                s += c;
            }
        }
        return s;
    }
}
