package com.encapsulation;
class Area{
    private int len; int bred;
    Area(int len,int bred){
        this.len = len;
        this.bred= bred;
    }
    public void getArea(){
        int area= len*bred;
        System.out.println("Area: "+ area);
    }
}
public class CSProgram {
    public static void main(String[] args){
        Area rec = new Area(7,9);
        rec.getArea();
    }
}
