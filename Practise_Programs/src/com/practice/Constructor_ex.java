package com.practice;

public class Constructor_ex {

        static int Constructor_ex(int base, int x) {
        int result = 1;
        while (x > 0) {
            result *= base;
            x--;
        }
        return result;
    }


    public static void main (String[]args)
        {
            System.out.println ("Required Power is " + Constructor_ex(5, 3));
        }


}
