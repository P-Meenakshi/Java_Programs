package com.Alpha;
import java.util.*;
public class Main {

    public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            System.out.println("enter three names");
            String s1 = str.nextLine();
            String s2 = str.nextLine();
            String s3 = str.nextLine();
            ArrayList<String> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
            Collections.reverse(list);
            System.out.println(list);
            for (String s : list) {
                    System.out.println(s);
            }
    }
}
