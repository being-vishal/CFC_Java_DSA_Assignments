package com.bepositive.assign1;

public class Pattern7 {
    public static void main(String[] args) {

        colMirr(5);
    }

    public static void colMirr(int i) {

        int rowmirr = 0;
        int rows = 0;
        while (rowmirr <2* i) {
            int cols = 0;
            int colsMir = 0;

            while (colsMir < 2 * i -1) {
                if (cols <= rows) {
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
