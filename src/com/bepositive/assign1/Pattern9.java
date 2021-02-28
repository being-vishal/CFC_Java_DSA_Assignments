package com.bepositive.assign1;

public class Pattern9 {

    public static void main(String[] args) {
        pattern9(5);
    }

    public static void pattern9(int i) {
        int rows = 5;
        int rowsmir = 0;
        while( rowsmir < 2*i-1){
            int cols = 5;
            int colsmir = 0;
            while (colsmir < 2*i-1){
                int max = Math.max(cols,rows);
                System.out.print(max +" ");

                if (colsmir < i-1){
                    cols--;
                }else{
                    cols++;
                }
                colsmir++;
            }
            System.out.println();
            if (rowsmir < i-1){
                rows--;
            }else{
                rows++;
            }

            rowsmir++;
        }

    }
}
