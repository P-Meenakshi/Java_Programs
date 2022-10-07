package com.Conditional_Statements;

public class Nested_if {
    public static void main(String[] args) {
        String address= "Delhi, Meerut, Noida";
        if(address.endsWith("Noida"))
        {
            if(address.contains("India"))
            {
                System.out.println("Your city is meerut");
            }
            else if (address.contains("Agra"))
            {
                System.out.println("Your city is noida");
            }
            else
            {
                System.out.println(address.split(",")[1]);
            }

        }
        else
        {
            System.out.println(" You are not living in  India");
        }
    }
}
