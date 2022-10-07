package com.variables;

import java.util.*;

public class Static_var {
    public static int r;
    public static final double pi=3.14;
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius");
        r= obj.nextInt();
        System.out.println("area of circle: " +pi*r*r);
    }
}
