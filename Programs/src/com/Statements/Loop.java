package com.Statements;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int n = obj.nextInt();
        for (int i=0; i<3;i++) {

            do {
                n=n+1;
                System.out.println(n);
            }
            while (n < 7);

        }


    }
}
