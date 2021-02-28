package com.bepositive.assign1;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int temp = n;
        int i = 0;

        while(temp > 0){
            temp /= 10;
            i++;
        }
        System.out.println("Number of digits in " +n+ " is " +i);
    }
}
