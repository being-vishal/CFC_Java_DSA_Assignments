package com.bepositive.assign1;

public class Pattern1 {
    public static void main(String[] args) {

        pattern(5);
    }

    public static void pattern(int i) {

        int row = 0 ;

        while(row < i){
            int col = 0;
            while(col <= row){

                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
