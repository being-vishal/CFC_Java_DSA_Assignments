package com.bepositive.assign1;

public class OddJump {
    public static void main(String[] args) {

        int n = 1;
        int j = 1;

        while (n <= 1000){
            if (n % 2 == 0 ){
                System.out.print(n + " ");
                for (int i = 1 ; i <= 4*j - 1 ; i++){
                    n++;
                }
                j++;
            }
            n++;
        }
    }
}
