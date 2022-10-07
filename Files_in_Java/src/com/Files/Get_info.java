package com.Files;
import java.io.IOException;
import java.io.File;

public class Get_info {
        public static void main(String[] args) {

            File obj = new File("/home/ubuntu/Documents/files.txt");
            if (obj.exists()) {
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());
                System.out.println(obj.canRead());
                System.out.println(obj.canWrite());
                System.out.println(obj.length());
            } else {
                System.out.println("file doesn't exist");
            }

        }
    }


