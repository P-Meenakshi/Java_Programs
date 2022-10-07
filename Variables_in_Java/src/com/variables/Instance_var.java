package com.variables;

public class Instance_var {
    public String name;
    public Instance_var()
    {
        System.out.println("Instance variable");
    }
    public static void main(String[] args){
        Instance_var a = new Instance_var();
        a.name ="ABC";
        System.out.println(a.name);
    }
}
