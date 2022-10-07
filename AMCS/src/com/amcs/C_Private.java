package com.amcs;
class H{
    private int a = 143;
}
public class C_Private {
    public static void main(String[] args){
        int a = 122;
        H o = new H();
        System.out.println("Private");
        System.out.println("Value of a:"+" "+a);



    }
}
