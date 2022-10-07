package com.constructors;

public class Constructor {
    public Constructor()
    {
        System.out.println("Constructor block");
    }
    public  void  method(){
        System.out.println("Method block");
    }
    public static void main(String[] args) {

        Constructor obj = new Constructor();
        obj.method();
    }
}
