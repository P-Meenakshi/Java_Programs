package com.MapandHashmap;
import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"AB");
        hm.put(2,"CD");
        hm.put(3,"EF");
        hm.put(4,"GH");
        //single
        System.out.println(hm.get(3));
        /*for (int i=0;i<=hm.size();i++){
            System.out.print(hm.get(i));
        }*/
        System.out.println(hm);
        //iterating over Map.entrySet() using for loop
        for(Map.Entry<Integer,String> data: hm.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }
        //iterator
        //Iterator<>
    }
}
