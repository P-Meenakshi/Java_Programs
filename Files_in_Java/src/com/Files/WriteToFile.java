package com.Files;
import java.io.FileWriter;
import  java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/ubuntu/Documents/files.txt");
            writer.write("Welcome To UST Global All the best for learning!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}