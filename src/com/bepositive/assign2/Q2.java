package com.bepositive.assign2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int n1 = s.nextInt();
        System.out.print("Enter second number :- ");
        int n2 = s.nextInt();
        System.out.print("Enter the character for operation :- ");
        char choice = s.next().charAt(0);

        int result;

        switch(choice){

            case '+' : result = n1 + n2;
                System.out.println("Addition of "+n1+" and "+n2+" is "+result);
                break;

            case '-' : result = n1 - n2;
                System.out.println("Subtraction of "+n1+" and "+n2+" is "+result);
                break;

            case '*' : result = n1 * n2;
                System.out.println("Multiplication of "+n1+" and "+n2+" is "+result);
                break;

            case '/' : if(n2 != 0) {
                result = n1 / n2;
                System.out.println("Division of "+n1+" and "+n2+" is "+result);
            }else{
                System.out.println("Infinite");
            }
                break;

            case '%' : if(n2 != 0) {
                result = n1 % n2;
                System.out.println("Division of "+n1+" and "+n2+" is "+result);
            }else{
                System.out.println("Infinite");
            }
                break;

            default  : System.out.println("You have not entered proper character");
        }

    }
}
