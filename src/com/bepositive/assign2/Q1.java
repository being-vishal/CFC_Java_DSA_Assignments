package com.bepositive.assign2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = s.nextInt();
        int rev = octalNum(n);
        int oct = reverse(rev);
        System.out.print("Octal format of "+n+ " is " +oct);

    }

    public static int octalNum(int n) {

        int r  , num = 0;
        while(n>0){
            r = n % 8;
            n /= 8;
            num = (num*10) + r;
        }
        return num;
    }

    private static int reverse(int rev) {
        int r , num = 0;
        while (rev > 0) {
            r = rev%10;
            num = (num*10)+r;
            rev /= 10;
        }
        return  num;
    }
}
