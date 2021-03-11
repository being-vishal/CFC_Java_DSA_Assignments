package com.bepositive.assign4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = s.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int add = n+sum(n-1);
        return add;
    }
}
