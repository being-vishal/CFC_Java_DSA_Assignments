package com.bepositive.assign2;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] nums = {1 ,2 ,3 ,4 ,9 ,5 ,6 ,7};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    public static int[] sortEvenOdd(int[] nums) {
        for (int j = nums.length-1 ; j >= 0 ; j--) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0 && i < j) {
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
