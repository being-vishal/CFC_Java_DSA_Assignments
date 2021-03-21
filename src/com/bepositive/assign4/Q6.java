package com.bepositive.assign4;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr1 = {2 , 5 , 6, 4 ,1 ,3 };
        int[] arr2 = new int[arr1.length];
        inverse(arr1, 1 , arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void inverse(int[] arr1, int start, int[] arr2) {
        if(start >= arr1.length+1){
            return;
        }
        arr2[arr1[start-1]-1] = start;
        inverse(arr1,start+1,arr2);
    }

}
