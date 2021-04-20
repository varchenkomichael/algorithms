package com.varchenko;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileFiboServiceTest {
    private static final String FILE_NAME = "fiboSequence.txt";

    @Test
    public void fiboSequenceGenerator_shouldCreateFileWithNumbers() {
        final int amountOfElements = 100;

        FileFiboService fileGeneratorService = new FileFiboService();
        fileGeneratorService.createFileWithFiboSequence(FILE_NAME, amountOfElements);

    }

    @Test
    public void fiboSequenceReaderLastElement() throws IOException {
        String fileName = "src/main/resources/fiboSequence.txt";
        FileFiboService fileGeneratorService = new FileFiboService();
        List<String> fiboNumbers = fileGeneratorService.readFiboNumbersFromFile(fileName);
        String expectedResult = "218922995834555169026";
        String result = fiboNumbers.get(fiboNumbers.size() - 1);
        assertEquals(expectedResult, result);
    }
}