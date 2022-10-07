package com.Statements;

public class Jump {
    public static void main(String[] args){
        int a = 0;int b= 1;
        int c;
        System.out.println(a+"\n"+b);

        for(int i=0;i<20;i++)
        {
            c = a + b;
            a = b;
            b = c;

        if (c<25){
            System.out.println(c);

            continue;}
        else{
            break;
            }
        }

    }
}
