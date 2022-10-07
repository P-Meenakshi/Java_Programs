package com.exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String [] args){
        try{
            //int a=12/0;
            int [] stuID =new int[5];
            stuID[0]= 1;
            stuID[1]=2;
            stuID[2]=3;
            stuID[3]=4;
            stuID[4]=5;
            //stuID[5]=5;
            //System.out.println(stuID[5]);
            //System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
