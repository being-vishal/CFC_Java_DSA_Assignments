package com.bepositive.assign2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the alphabet :-  ");
        char c = s.next().charAt(0);
        determineCase(c);
    }

    private static void determineCase(char c) {

        if(c >= 'A' && c <= 'Z'){
            System.out.println(c+" is an UPPERCASE letter.");
        }else if(c >= 'a' && c <= 'z'){
            System.out.println(c+" is a lowercase letter.");
        }else{
            System.out.println("You have not entered an alphabet.");
        }
    }

}
