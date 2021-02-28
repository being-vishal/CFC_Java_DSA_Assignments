package com.bepositive.assign1;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern4(int i) {
        int rows = 0;

        while(rows < i) {
            int cols = 0;
            int colsmir = 0;
            int count = 2-i;
            while (colsmir < 2 * i - 1) {
                if (cols >= i - rows-1){
                    System.out.print( 2*rows+count+" ");
                }else{
                    System.out.print("  ");
                }

                if(colsmir < i - 1){
                    cols++;
                    count++;
                }else{
                    cols--;
                    count--;
                }
                colsmir++;

            }
            System.out.println();
            rows++;
        }
    }
}
