package com.bepositive.assign2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number :- ");
        int n1 = s.nextInt();
        System.out.print("Enter second number :- ");
        int n2 = s.nextInt();

        lcm(n1,n2);
    }

    public static void lcm(int n1, int n2) {
        int max = Math.max(n1, n2);
        if(n1 == 0 || n2 ==0){
            System.out.println("The LCM of zero does not exist. Remove 0's and try again.");
        }else {

            while (true) {
                if (max % n1 == 0 && max % n2 == 0) {
                    System.out.println(max + " is the LCM");
                    break;
                }
                max++;
            }
        }
    }
}
