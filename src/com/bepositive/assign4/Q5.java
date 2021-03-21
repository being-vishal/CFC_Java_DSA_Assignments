package com.bepositive.assign4;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr , 0 , arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        if(start >= end){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);

    }
}
