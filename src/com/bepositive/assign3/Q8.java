package com.bepositive.assign3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int n = s.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }

        intersection(arr1 , arr2);
    }

    private static void intersection(int[] arr1, int[] arr2) {
        System.out.print("{");
        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr2[j]+",");
                    arr2[j] = 0;
                    break;
                }
            }
        }
        System.out.print("}");
    }

}
