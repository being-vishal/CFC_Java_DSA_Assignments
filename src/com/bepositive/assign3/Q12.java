package com.bepositive.assign3;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :-");
        String str = sc.nextLine();
        System.out.println(difference(str));
    }

    public static String difference(String s) {
        String str = s;
        s = "" + s.charAt(0);
        for (int i = 1; i < str.length(); i++) {

            char c = str.charAt(i);
            char d = str.charAt(i-1);
            int a =(int)c ;
            int b = (int)d;
            a = a-b;
            s = s + a +c;
        }
        return s;
    }
}
