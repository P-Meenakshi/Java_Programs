package com.practice;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> num = new java.util.ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        int ele1 = num.indexOf(7);
        int ele2 = num.indexOf(10);
        if(ele1==-1){
            System.out.println("no element 7 in ArrayList");
        }
        else{
            System.out.println("7 is at: "+ele1);
        }
        if(ele2==-1){
            System.out.println("no element 10 in ArrayList");
        }
        else{
            System.out.println("10is at: "+ele2);
        }

    }
}
