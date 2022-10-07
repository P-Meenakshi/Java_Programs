package com.Inheritance;
class A{
    String s = "Hello";
    public void method1(){
        System.out.println("This is");
    }
}
class B extends A{
    public void method2(){
        System.out.println("an example for");
    }
}
public class Multilevel_inheritance extends B {
    public  void method3(){
        System.out.println("Multilevel inheritance");
    }
    public static void main(String[] args){
        Multilevel_inheritance obj = new Multilevel_inheritance();
        System.out.println(obj.s);
        obj.method1();
        obj.method2();
        obj.method3();
    }

}
