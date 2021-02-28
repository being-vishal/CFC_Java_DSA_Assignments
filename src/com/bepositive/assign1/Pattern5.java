package com.bepositive.assign1;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int i) {
        int rows = 0;
        while(rows <= i){
            int cols = 0;
            while(cols <= rows){
                System.out.print( facto( rows ) / (facto( cols )* facto(rows-cols)) + "  ");
                cols++;
            }
            System.out.println();
            rows++;
        }
    }

    public static int facto(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return  fact;
    }
}
