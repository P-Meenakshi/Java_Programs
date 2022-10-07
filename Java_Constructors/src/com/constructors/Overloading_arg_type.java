package com.constructors;

public class Overloading_arg_type {
     public Overloading_arg_type(int a ,int b){
         int c = a*b;
         System.out.print("Product: " + c);
     }
     public Overloading_arg_type( double a, double b){
         double c = a*b;
         System.out.print("\nProduct: " + c);
     }
     public void display(){
         System.out.print("\n Constructor method overloading");
     }
    public static void main(String[] args){
        Overloading_arg_type obj1 = new Overloading_arg_type(5,6);
        obj1.display();
        Overloading_arg_type obj2 = new Overloading_arg_type(5.7,6.9);
        obj2.display();
    }
}
