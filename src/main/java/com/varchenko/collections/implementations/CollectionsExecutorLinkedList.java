package com.varchenko.collections.implementations;

import com.varchenko.collections.CollectionsExecutor;

import java.util.LinkedList;

public class CollectionsExecutorLinkedList implements CollectionsExecutor<String, LinkedList<String>> {
    @Override
    public boolean fillCollectionWithElements(int amountOfElements, LinkedList<String> collection) {
        return false;
    }

    @Override
    public String addElement(String element) {
        return null;
    }

    @Override
    public String removeElement(String element) {
        return null;
    }

    @Override
    public boolean checkIfElementExist(String element) {
        return false;
    }

    @Override
    public boolean trimTheCollection() {
        return false;
    }

    @Override
    public LinkedList<String> getCollection() {
        return null;
    }

    @Override
    public void setCollection(LinkedList<String> collection) {

    }

    @Override
    public LinkedList<String> updateElementInCollection(LinkedList<String> oldValue, LinkedList<String> newValue) {
        return null;
    }

    @Override
    public int indexOfElement(String element) {
        return 0;
    }

    @Override
    public LinkedList<String> getReversedCollection() {
        return null;
    }

    @Override
    public int compareWithOtherCollection(LinkedList<String> otherCollection) {
        return 0;
    }

    @Override
    public LinkedList<String> cloneTheCollection(LinkedList<String> otherCollection) {
        return null;
    }
}
