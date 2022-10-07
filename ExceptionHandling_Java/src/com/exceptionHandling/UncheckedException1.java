package com.exceptionHandling;

public class UncheckedException1 {
    public static void main(String[] args){
        try {
            int n = 10/0;
            System.out.println("value of n: "+n);
        }catch(ArithmeticException e){
            System.out.println("Exception found: "+e.getMessage());
            System.out.println(e.getCause());
        }finally{
            System.out.println(" Arithmetic exception");
        }
    }
}
