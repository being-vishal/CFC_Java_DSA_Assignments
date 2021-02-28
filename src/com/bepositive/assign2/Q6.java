package com.bepositive.assign2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min;
        int gcd = 0;

        System.out.print("Enter first number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :- ");
        int num2 = sc.nextInt();

        min = Math.min(num1, num2);

        if(num1 ==0){
            System.out.println(num2 + " is GCD.");
        }else if(num2 == 0 ){
            System.out.println(num1 + " is GCD.");
        }else if(num1 > num2 && num1%num2 == 0){
            System.out.println(num2 + " is GCD.");
        }else if(num2 % num1 == 0){
            System.out.println(num1 + " is GCD.");
        }else{

            for(int i = 1 ; i <= min ; i++){
                if(num1 % i == 0 & num2 % i == 0 ){
                    gcd = i;
                }
            }
            System.out.println(gcd + " is GCD.");
        }
        sc.close();

    }
}
