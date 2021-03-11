package com.bepositive.assign4;
public class Q1 {
    public static void main(String[] args) {
      int n = 5;
      int row = 0 ;
      int col = 0 ;
      printPascal(n,row,col);

    }
    public static void printPascal(int n, int row, int col) {
        if(col > row || row>n){
            System.out.println();
            return ;
        }

        System.out.print( fact(col)/(fact(row)*fact(col-row)) + "  ");
        col++;
        row++;
        printPascal(n,row,col);

    }
    public static int fact(int i) {
        int product = 1;
        for (int j = i; j > 0; j--) {
            product *= j;
        }
        return product;
    }
}
