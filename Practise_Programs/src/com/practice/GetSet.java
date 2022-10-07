package com.practice;

import java.util.Scanner;

public class GetSet {
        private int len;
        private int bred;
        public int getLen(){return len;}
        public void setLen(int len)
        {this.len = len;}
        public int getBred(){return bred;}
        public void setBred(int bred)
        {this.bred= bred;}
       public void getArea(){
            int area= len*bred;
            System.out.println("Area: "+ area);}
        public int getPerimeter(){
            int perimeter = 2*(len+bred);
            return perimeter;
        }


        public static void main(String[] args){
            GetSet obj = new GetSet();
            Scanner sc =new Scanner(System.in);
            obj.setLen(sc.nextInt());
            obj.setBred(sc.nextInt());
            obj.getArea();
            System.out.println("Perimeter: "+obj.getPerimeter());

        }}



