package com.bepositive.assign1;

import java.util.Scanner;

public class CampusLeader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the credits :-  ");
        int n = sc.nextInt();

        if( n >= 7500 ){
            System.out.println("Tera Leader");
        }else if( n >= 6000 && n < 7500){
            System.out.println("Gega Leader");
        }else if( n >= 4500 && n < 6500 ){
            System.out.println("Mega Leader");
        }else{
            System.out.println("Rising Star");
        }
    }
}
