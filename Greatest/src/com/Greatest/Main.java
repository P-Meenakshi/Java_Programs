package com.Greatest;
import java .util.*;
public class Main {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter three numbers");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
        if ((num1>num2)&& (num1>num3))
            System.out.println(num1+" "+  "is Greatest");
        else if (num2 > num3)
            System.out.println(num2+" "+ "is Greatest");
        else
            System.out.println(num3+" " + "is Greatest");
    }
}
