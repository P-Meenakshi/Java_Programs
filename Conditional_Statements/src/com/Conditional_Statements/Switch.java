package com.Conditional_Statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.println("enter a number");
        int n=num.nextInt();
        switch(n)
        {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            default:
                System.out.println("Enter a number between 0-2");
                break;
        }
    }

}
