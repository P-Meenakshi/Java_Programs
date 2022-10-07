package com.encapsulation;
class StudentBean {
    private int stuID;
    private String stuName;
    public int getStuID() {
        return stuID;
    }
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        StudentBean sb = new StudentBean();
        sb.setStuID(111);
        sb.setStuName("Meenakshi");
        System.out.println("Student ID  :" + sb.getStuID());
        System.out.println("Student Name  :" + sb.getStuName());
    }
}
