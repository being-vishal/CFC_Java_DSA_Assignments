package com.bepositive.assign3;

public class Q13 {
    public static void main(String[] args) {
    String s = "aabb";
    int n = perfectness(s);
    System.out.println(n);
    }

    private static int perfectness(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = ""+ s.charAt(i);
            if(str.equals("a")){
                count++;
            }
        }
        if(count > s.length()/2 ){
            count = count;
        }else{
            count = s.length()-count;
        }
        return count + 2;
    }
}
