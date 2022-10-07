package com.practice;

    interface In1 {
         int a = 10;
        void display();
    }
    class Interface_ex implements In1 {

        public void display(){
            System.out.println(a*a*a);
        }
        public static void main(String[] args)
        {
            Interface_ex t = new Interface_ex();
            t.display();
            System.out.println(a);
        }
    }


