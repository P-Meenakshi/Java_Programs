package com.polymorphism;
class A{
    public void disp(){
        System.out.println("Parent class is called");}
}
class B extends A{
    public void disp(){
        System.out.println("Child class is called");}
}
public class Overriding {
    public static void main(String [] args){
        A obj1 = new A();
        B obj2 = new B();
        obj1.disp();
        obj2.disp();
    }
}
