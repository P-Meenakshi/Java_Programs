//Checked Exception Try_catch
package com.exceptionHandling;
class  CheckedException{
    int a = 15;
    public void method1(){
        System.out.println("Value of a: "+a);
    }
}
public class Main1 {
    public static void main(String[] args){
        CheckedException obj = new CheckedException();
        obj.method1();
        try {
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
