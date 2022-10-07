package com.practice;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

class Do_While_loop{
    public int fact(int n){
        int fn =n*(n-1);
        return fn;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int fn=0;
    int n = sc.nextInt();
    do{
        new Do_While_loop().fact(n);
    }while(fn>0);
    

}}