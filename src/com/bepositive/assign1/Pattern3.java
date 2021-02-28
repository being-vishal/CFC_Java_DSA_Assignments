package com.bepositive.assign1;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    public static void pattern3(int i) {
        int rows = 0;
        while(rows < i) {
            int cols = 0;
            int colsmir = 0;
            while (colsmir < 2 * i - 1) {
                if (cols >= i - rows-1){
                    System.out.print(-i+2+cols+rows +" ");
                }else{
                    System.out.print("  ");
                }

                if(colsmir < i - 1){
                    cols++;
                }else{
                    cols--;
                }
                colsmir++;
            }
            System.out.println();
            rows++;
        }
    }
}
