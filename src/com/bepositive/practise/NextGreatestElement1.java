package com.bepositive.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreatestElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] nums3 = nextGreaterElement(nums1 , nums2);
        System.out.println(Arrays.toString(nums3));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>greatest = new HashMap();
        Stack<Integer> stack = new Stack();

        for(Integer num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                greatest.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = greatest.getOrDefault(nums1[i] , -1);
        }
        return nums1;
    }
}
