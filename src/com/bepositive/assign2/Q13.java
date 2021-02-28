package com.bepositive.assign2;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[] nums = {9 ,4 ,2 ,3 ,1 ,7 ,1 };
        int[] sorted = reverseArr(nums);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] reverseArr(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++){
            if(i < nums.length/2) {
                swap(nums, i, nums.length-1-i);
            }
        }
        return  nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
