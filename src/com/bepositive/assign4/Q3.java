package com.bepositive.assign4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = s.nextInt();
        System.out.print("Enter array :- ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the target element");
        int target = s.nextInt();
        int index = location(arr,target,0);
        System.out.println(index);
    }

    private static int location(int[] arr, int target, int start) {
        if(start >= arr.length-1){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }else{
            return location(arr , target, start+1);
        }
    }
}
