package com.exceptionHandling;

public class Finally {
    public static void main(String[] args){
        try {
            int[] a = {1, 2, 3, 4};
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println("Exception  caught");
        }
        finally{
            System.out.println("This is executed");
        }
    }
}
