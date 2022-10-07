package com.constructors;

public class Overloading_arg_number {
    public Overloading_arg_number(int a ,int b){
        int c = a*b;
        System.out.print("Product: " + c);
    }
    public Overloading_arg_number(int a,int b,int d){
        double c = a*b*d;
        System.out.print("\nProduct: " + c);
    }
    public void display(){
        System.out.print("\n Constructor method overloading");
    }
    public static void main(String[] args){
        Overloading_arg_number obj1 = new Overloading_arg_number(5,6);
        obj1.display();
        Overloading_arg_number obj2 = new Overloading_arg_number(5,6,7);
        obj2.display();
    }
}
