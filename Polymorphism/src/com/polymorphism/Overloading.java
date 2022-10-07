package com.polymorphism;
class Method_overloading{
    void disp(){
        System.out.println("Nothing");
    }
    void disp(int val){
        System.out.println(val);
    }
    void disp(String val1,String val2){
        System.out.println(val1+val2);
    }
}
public class Overloading {

    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        obj.disp();
        obj.disp(10);
        obj.disp("hey ","user");
    }
}
