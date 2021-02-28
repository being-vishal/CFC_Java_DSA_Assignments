package com.bepositive.assign3;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of array :- ");
        int n = s.nextInt();
        System.out.print("Enter the length sub of array :- ");
        int n2 = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }
        System.out.println(sum(arr , n2));

    }
    public static int sum (int[] arr , int num ){
        int sum = 0 ;
        for (int i = 0; i <= arr.length-num; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i+1 ; j < num +i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                }
                if (arr[j] < min){
                    min = arr[j];
                }
            }
            sum += max + min;
        }
        return sum;
    }
}
