package com.Files;
import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void  main(String [] args){
        try{
            File obj = new File("/home/ubuntu/Documents/files.txt");
            Scanner read = new Scanner(obj);
            while(read.hasNext()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
