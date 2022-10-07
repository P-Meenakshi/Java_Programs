
package com.exceptionHandling;

public class Throw_Exception {

    static void CheckAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        CheckAge(25);
    }
}
