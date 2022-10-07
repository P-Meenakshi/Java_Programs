package com.list;
import java.util.*;
public class AL_ex2 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        int siz = sc.nextInt();//no of elements
        int k = sc.nextInt();
        /*int n=0;
        while(n<siz){
            int num = sc.nextInt();
            n++;
            al.add(num);
        }*/
        for(int i=0;i<siz;i++){
            int num= sc.nextInt();
            al.add(num);
        }
        Collections.sort(al);
        for(int j=siz-1;j>=k;j--){
            System.out.println(al.get(j));
        }
    /*Collections.sort(al,Collections.reverseOrder());
        for(int j=0;j<k;j++){
            System.out.println(al.get(j));
        }*/
    }
}
