package com.bepositive.assign1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount :- ");
        float a = sc.nextFloat();
        System.out.print("Enter rate :- ");
        float r = sc.nextFloat();
        System.out.print("Enter time :- ");
        float t = sc.nextFloat();

        float s = (a*r*t)/100;
        System.out.println("Simple Interest is " +s);
    }
}
