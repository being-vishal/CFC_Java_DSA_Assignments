package com.bepositive.assign2;

public class Q9 {
    public static void main(String[] args) {

        int[] nums = {10 ,3539,1287821 ,2147483647 ,970 ,30 ,51390};
        int count = primeNums(nums);
        System.out.println("There are "+(nums.length - count)+" prime numbers.");
    }

    public static int primeNums(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 2){
                count++;
            }else {
                for (int j = 2; j < nums[i]; j++) {
                    if (nums[i] % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        return  count;
    }
}
