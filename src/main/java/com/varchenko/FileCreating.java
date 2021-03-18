package com.varchenko;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreating {
    public static void main(String[] args) {


        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\resources\\MishaFile.txt");
        try {
            String str = "hello";
            byte[] bs = str.getBytes(StandardCharsets.UTF_8);
            Path filePath = Files.write(path, bs);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}