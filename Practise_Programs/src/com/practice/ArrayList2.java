package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args){
        java.util.ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        int siz = sc.nextInt();//no of elements
        int k = sc.nextInt();
        /*int n=0;
        while(n<siz){
            int num = sc.nextInt();
            n++;
            al.add(num);
        }*/
        for(int i=0;i<siz;i++){
            int num= sc.nextInt();
            al.add(num);
        }
        Collections.sort(al);
        for(int j=siz-1;j>=k;j--){
            System.out.println(al.get(j));
        }
    /*Collections.sort(al,Collections.reverseOrder());
        for(int j=0;j<k;j++){
            System.out.println(al.get(j));
        }*/
    }
}
