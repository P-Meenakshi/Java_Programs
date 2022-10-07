package com.encapsulation;
class Stu{
    int stdserialNo; String stdName; int stdAge;
    Stu(int stdserialNo, String stdName, int stdAge){
        this.stdserialNo=stdserialNo;
        this.stdName=stdName;
        this.stdAge=stdAge;
    }
    void getStu(){
        System.out.println("Student serial No: "+stdserialNo);
        System.out.println("Student Name     :"+stdName);
        System.out.println("Student Age      :"+stdAge);
    }
}
public class Student {
    public static void main(String[] args){
        Stu s = new Stu(21,"ABC",16);
        s.getStu();
    }
}
