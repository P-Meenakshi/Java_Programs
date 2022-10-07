package com.math;

public class Bitwise_operators {
    public static void main(String[] args) {
        int a = 5; int b=7;
        int ls = a << 2;
        int rs = a >> 2;
        int bor= a|b;
        int band= a&b;
        int bxor= a^b;
        int bn=~a;
        System.out.println("Value of a:"+" "+a);
        System.out.println("After left shift:"+" "+ls);
        System.out.println("After right shift:"+" "+rs);
        System.out.println("OR : " +bor);
        System.out.println("AND : " +band);
        System.out.println("XOR : " +bxor);
        System.out.println("Not : " +bn);
    }
}
