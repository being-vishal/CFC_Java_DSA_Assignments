package com.bepositive.assign2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int temp = n;
        int result = 0;


        while(temp > 0){
            int ld = temp%10;
            result = result * 10 + ld;
            temp /= 10;

        }
        System.out.println("Reversed number of " +n+ " is " + result);
    }
}
