package com.Inheritance;
class D{
    public void showd(){
        System.out.println("Grandfather");
    }
}
class F extends D{
        public  void showF(){
            System.out.println("Father");
        }
    }
 class S extends F{
    public void showS(){
        System.out.println("Son");
    }

 }
public class Hybrid_inheritance  extends F{
    public void showd(){
        System.out.println("Daughter");
    }
    public static void main(String [] args){
        Hybrid_inheritance dau = new Hybrid_inheritance();
        S son = new S();
        dau.showd();
        dau.showF();
        son.showS();
    }
}
