package com.Files;

import java.io.File;
import java.io.IOException;

public class CreateDoc {
    public static void main(String[] args) {
        try{
            File obj = new File("/home/ubuntu/Documents/files.txt" );
            if(obj.createNewFile()){
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());}
            else{
                System.out.println("file already exist");}
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
