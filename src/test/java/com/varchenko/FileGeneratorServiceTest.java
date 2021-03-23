package com.varchenko;

import org.junit.jupiter.api.Test;
// 1) todo create a method to read a file to the List<String>
// 2) todo create test which will read a file and check the last element
class FileGeneratorServiceTest {
    private static final String FILE_NAME = "fiboSequence.txt";

    @Test
    public void fiboSequenceGenerator_shouldCreateFileWithNumbers() {
        final int amountOfElements = 100;

        FileGeneratorService fileGeneratorService = new FileGeneratorService();
        fileGeneratorService.createFileWithFiboSequence(FILE_NAME, amountOfElements);

    }
}