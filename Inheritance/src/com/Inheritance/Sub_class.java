package com.Inheritance;

public class Sub_class extends Base_class{
    public String b= "DEF";
    void show(){
        System.out.println("Last name:");
    }
    public static void main(String[] args){
        Sub_class obj = new Sub_class();
        String c = obj.a;
        String d = obj.b;
        obj.display();
        System.out.println(c);
        obj.show();
        System.out.println(d);
    }

}
