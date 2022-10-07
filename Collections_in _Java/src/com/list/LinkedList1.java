package com.list;
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<Comparable> ll = new LinkedList<Comparable>();
        ll.add(33);
        ll.add("key");
        ll.add(45);
        ll.add("abc");
        ll.add(20);
        System.out.println(ll);
        System.out.println("Size: "+ll.size());
        ll.remove(4);
        ll.add(22);
        System.out.println("After insertion: "+ll);
        ll.set(3,"def");
        System.out.println("After replacing: "+ll);
        System.out.println(ll.contains(45));
        System.out.println(ll.isEmpty());
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        for (Comparable comparable : ll) {
            System.out.println(comparable);
        }
        Iterator<Comparable> c = ll.iterator();
        while(c.hasNext()){
            System.out.print(c.next()+" ");
        }
        // methods
        ll.addFirst(1);
        ll.addLast("last");
        System.out.println("\n"+ll);
    }
}
