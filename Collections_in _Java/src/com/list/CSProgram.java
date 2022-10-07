package com.list;
import java.util.*;
public class CSProgram {
    public static void main(String [] args){
        ArrayList<Object> ex = new ArrayList<Object>();
        ex.add(7);
        ex.add('C');
        ex.add(42.7f);
        ex.add(4726L);
        ex.add(930284d);
        ex.add("Voila");
        ex.add("This");
        ex.add("is a");
        ex.add("Linked");
        ex.add("List");
        ex.add(2);
        System.out.println(ex);
        System.out.println(ex.size());
        Iterator<Object> o = ex.iterator();
        while(o.hasNext()){
            System.out.print(o.next()+" ");
        }


    }

}
