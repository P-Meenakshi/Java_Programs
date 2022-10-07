package com.Assignment;

import java.util.Scanner;

public class Main {
    static  double perimeter(double l,double b)
    {
        double p;
        p=2*(l+b);
        return p;
    }

    public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);
            System.out.println("enter two numbers");
            double l = obj.nextDouble();
            double b = obj.nextDouble();
            System.out.println("Perimeter of Rectangle"+" "+perimeter(l,b));
    }
}
