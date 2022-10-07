package com.encapsulation;
class Emp{
    int empserialNo; String empName; int empAge;
    Emp(int empserialNo, String empName, int empAge){
        this.empserialNo =empserialNo;
        this.empName=empName;
        this.empAge=empAge;
    }
    void getEmp(){
        System.out.println("Employee serial No  : "+empserialNo);
        System.out.println("Employee Name       : "+empName);
        System.out.println("Employee Age        : "+empAge);
    }
}
public class Employee {
    public static void main(String[] args){
        Emp e = new Emp(361,"Meenakshi",21);
        e.getEmp();
    }
}
