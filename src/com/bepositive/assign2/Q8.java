package com.bepositive.assign2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? :- ");
        int n = s.nextInt();

        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            System.out.print("Enter " +(i+1)+ ( " number :- "));
            nums[i] = s.nextInt();
        }

        int mul = multiples(nums);
        System.out.println("You have entered "+mul+" multiples of 5.");
    }

    private static int multiples(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] % 5 == 0){
                count++;
            }
        }
        return count;
    }
}
