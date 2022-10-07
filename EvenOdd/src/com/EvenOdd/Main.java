package com.EvenOdd;
import java.util.*;
public class Main {

    public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("enter a number");
            int n =num.nextInt();
            if (n % 2==0)
                System.out.println(n+" "+"is Even");
            else
                System.out.println(n+" "+"is Odd");
        }
    }

