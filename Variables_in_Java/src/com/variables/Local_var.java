package com.variables;
public class Local_var {
    public void method()
    {
        int a= 10;int b=20;
        int c = a+b ;
        System.out.println("local variable1");
        System.out.println(c);
    }
    public static void main(String[] args) {
       int c= 10;
        Local_var obj  = new Local_var();
        obj.method();
        System.out.println("local variable2");
        System.out.println(c);
    }
}
