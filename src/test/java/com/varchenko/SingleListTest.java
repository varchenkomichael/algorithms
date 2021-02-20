package com.varchenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleListTest {
    SingleList singleList = new SingleList();

    @Test
    void ListElements() {
        singleList.linky.addAll(singleList.getLinky());
        int expectedResult = 1;
        int result = singleList.linky.get(0);
        assertEquals(expectedResult, result);
    }

    @Test
    void add_2_Element() {
        singleList.linky.addAll(singleList.getLinky());
        singleList.linky.add(2, 5);
        int expectedResult = 5;
        int result = singleList.linky.get(2);
        assertEquals(expectedResult, result);
    }

    @Test
    void add_Last_Elements() {
        singleList.linky.addLast(3);
        int expectedResult = 3;
        int result = singleList.linky.getLast();
        assertEquals(expectedResult, result);
    }

    @Test
    void add_First_Element() {
        singleList.linky.addFirst(-1);
        int expectedResult = -1;
        int result = singleList.linky.getFirst();
        assertEquals(expectedResult, result);

    }
}




