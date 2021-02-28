package com.bepositive.assign2;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n = s.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements of the array :- ");
        for (int i = 0; i < n ; i++) {
            nums[i] = s.nextInt();
        }
        System.out.print("Enter the target :-");
        int elt = s.nextInt();
        sum(nums , elt);
    }

    public static void sum(int[] nums , int elt) {

        for (int i = 0; i < nums.length-2; i++) {
            for(int j = i+1 ; j < nums.length-1 ; j++ ){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == elt){
                        System.out.print("("+nums[i]+","+nums[j]+","+nums[k]+") ,");
                    }
                }
            }
        }
    }
}
