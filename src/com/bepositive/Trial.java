package com.bepositive;
import java.util.Scanner;
public class Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tnereffiD kniht");
        int n = sc.nextInt();
        print(n);
    }
    private static void print(int n) {
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print( fact(i)/(fact(j)*fact(i-j)) + "  ");
            }
            System.out.println();
        }
    }
    private static int fact(int i) {
        int product = 1;
        for (int j = i; j > 0; j--) {
            product *= j;
        }
        return product;
    }
}
