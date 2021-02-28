package com.bepositive.assign3;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = s.nextInt();
        int[] strength = new int[n];
        System.out.print("Enter the elements of array :");
        for (int i = 0; i < n ; i++) {
            strength[i] = s.nextInt();
        }
        System.out.print("Enter the length of subgroup : ");
        int length = s.nextInt();
        strength(strength , length);
    }

    private static void strength(int[] strength, int length) {
        Arrays.sort(strength);
        for (int i = strength.length-length ; i < strength.length ; i++) {
            System.out.print(strength[i] +" ");
        }
    }
}
