package com.bepositive.assign1;

public class Pattern6 {
    public static void main(String[] args) {

        pattern6(5);
    }

    public static void pattern6(int i) {

        int rowmirr = 0;
        int rows = 0;
        while (rowmirr < 2* i-1) {
            int cols = 0;
            int colsMir = 0;

            while (colsMir < 2 * i - 1) {
                if ((cols + rows) < i-1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
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
