package com.varchenko;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFulfillLab {

    public void createFileWithFiboSequence(String fileName, int amountOfElements) {
        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\sortproject\\src\\main\\resources\\" + fileName);
        try {
            String str = "fibonacci number for 16th member" +
                    " 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610";
            byte[] bs = str.getBytes(StandardCharsets.UTF_8);
            Path filePath = Files.write(path, bs);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}