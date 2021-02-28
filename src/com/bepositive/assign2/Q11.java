package com.bepositive.assign2;

public class Q11 {
    public static void main(String[] args) {
        int[] nums = {1 ,1 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,1};
        countNum(nums);
    }

    public static void countNum(int[] nums) {
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count0++;
            }else{
                count1++;
            }
        }

        for (int i = 0; i < count0 ; i++) {
            System.out.print("0 ,");
        }
        for (int i = 0; i < count1; i++) {
            if(i < count1-1) {
                System.out.print("1 ,");
            }else{
                System.out.print("1 ");
            }
        }
    }
}
