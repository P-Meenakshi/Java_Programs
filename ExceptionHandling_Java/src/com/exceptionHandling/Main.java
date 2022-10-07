package com.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exception  caught");
        }
    }
}
