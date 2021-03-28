package com.varchenko;


import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileFiboService {
    public void createFileWithFiboSequence(String fileName, int amountOfElements) {
        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\sortproject\\src\\main\\resources\\" + fileName);
        try {
            FibonacciSequence fibonacciSequence = new FibonacciSequence();
            List<BigInteger> allFiboNumbers = fibonacciSequence.getAllFiboNumbers(amountOfElements);
            List<String> collect = allFiboNumbers.stream().map(BigInteger::toString).collect(Collectors.toList());
            Path filePath = Files.write(path, collect, Charset.defaultCharset());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> readFiboNumbersFromFile(String fileName) throws IOException {
        Path file = Paths.get(fileName);
        List<String> lines = Files.readAllLines(file);
        return lines;
    }
}