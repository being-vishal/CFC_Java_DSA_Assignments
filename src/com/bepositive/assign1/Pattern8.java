package com.bepositive.assign1;

public class Pattern8 {
    public static void main(String[] args) {

        pattern8(5);
    }

    public static void pattern8(int i) {

        int rowmirr = 0;
        int rows = 0;
        while (rowmirr <2* i-1) {
            int cols = 0;
            int colsMir = 0;

            while (colsMir < 2 * i - 1) {
                if ((cols + rows) < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                if (colsMir < i - 1) {
                    cols++;
                } else {
                    cols--;
                }
                colsMir++;
            }
            System.out.println();
            if (rowmirr < i - 1) {
                rows++;
            } else {
                rows--;
            }
            rowmirr++;

        }
    }
}
