
//Single inheritance
package com.Inheritance;
class Teacher{
    String designation="Teacher";
    String collegName ="ABD college";
}
public class ComputerTeacher extends  Teacher{
    String mainSubject = "Physics";
    public static void main(String[] args){
        ComputerTeacher s = new ComputerTeacher();
        System.out.println("Single inheritance");
        System.out.println("College Name: "+s.collegName);
        System.out.println("Designation: "+s.designation);
        System.out.println("Main Subject: "+s.mainSubject);
    }
}
