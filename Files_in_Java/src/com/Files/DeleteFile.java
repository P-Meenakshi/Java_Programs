package com.Files;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {

            File obj = new File("C:\\Users\\237709\\Desktop\\Assignments\\Notes\\Files.txt");
            if (obj.delete()) {
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());
            } else {
                System.out.println("file already exist");
            }

    }
}
