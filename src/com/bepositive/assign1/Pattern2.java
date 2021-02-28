package com.bepositive.assign1;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern2(int i) {

        int rows = 1;
        while (rows <= i) {
            int cols = 1;
            while (cols <= rows ){

                System.out.print(cols +" ");
                cols++;

            }
            System.out.println();
            rows++;
        }
    }
}
