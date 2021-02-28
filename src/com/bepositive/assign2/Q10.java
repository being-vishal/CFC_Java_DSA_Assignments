package com.bepositive.assign2;

public class Q10 {
    public static void main(String[] args) {

        int[] nums = {10,20 ,970 ,3000 ,13000};
        boolean a = checkArr(nums);
        if (a){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }

    public static boolean checkArr(int[] nums) {
        int i = 1;
        boolean a = false;
        while (i < nums.length){
            if(nums[i-1] > nums[i]){
                a = false;
                break;
            }else{
                a = true;
            }
            i++;
        }
        return  a;
    }
}
