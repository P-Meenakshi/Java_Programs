package com.amcs;
class D{
    protected int a= 143;
}
public class C_Protected  extends D{
    public static void main(String[] args){
        D o = new D();
        System.out.println("Value of a:"+" "+o.a);
    }


}
