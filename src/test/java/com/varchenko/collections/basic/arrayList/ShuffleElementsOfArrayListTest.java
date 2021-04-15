package com.varchenko.collections.basic.arrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleElementsOfArrayListTest {
    ShuffleElementsOfArrayList<String> shuffleElementsOfArrayList = new ShuffleElementsOfArrayList();
    private ArrayList<String> shuffleElements() {
        ArrayList<String> empty = new ArrayList<>();
        return shuffleElementsOfArrayList.addElements(empty, "Red", "Blue", "Green", "Pink", "Black");
    }
    @Test
    void shuffleElementsOfArrayList(){
        int resultRed, resultBlue, resultGreen, resultPink, resultBlack;
        ArrayList<Integer> listOfUnshuffledElementsIndexes = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        ArrayList<String> shuffledArrayList = shuffleElements();
        shuffleElementsOfArrayList.shuffleElement(shuffledArrayList);
        resultRed = shuffledArrayList.indexOf("Red") ;
        resultBlue = shuffledArrayList.indexOf("Blue") ;
        resultGreen = shuffledArrayList.indexOf("Green") ;
        resultPink = shuffledArrayList.indexOf("Pink");
        resultBlack = shuffledArrayList.indexOf("Black") ;
        ArrayList<Integer> listOfIndexes = new ArrayList<>(Arrays.asList(resultRed, resultBlue, resultGreen, resultPink, resultBlack));
        assertNotEquals(listOfUnshuffledElementsIndexes, listOfIndexes);
    }
}