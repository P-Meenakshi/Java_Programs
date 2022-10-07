package com.variables;
public class CSProgram {
    static int a=100;//static variable
    void add() {
        int b = 20;//instance variable
        int c;
        c=a+b;
        System.out.println(c+"\n");
    }
    public static void main(String []args){
        int a= 30;
        int e= 20;//local variable
        int d= a+e;
        CSProgram obj = new CSProgram();
        obj.add();
        System.out.println(d);
    }
}
