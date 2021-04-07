package com.varchenko.collections.implementations;

import com.varchenko.collections.CollectionsExecutor;

import java.util.ArrayList;

public class CollectionsExecutorArrayList implements CollectionsExecutor<String, ArrayList<String>> {
    private ArrayList<String> collection;

    @Override
    public boolean fillCollectionWithElements(int amountOfElements, ArrayList<String> collection) {
        if (amountOfElements != collection.size())
            throw new IllegalArgumentException("Wrong size: expected " + amountOfElements
                    + ", but actual " + collection.size());
        this.collection.addAll(collection);
        return true;
    }

    @Override
    public String addElement(String element) {
        collection.add(element);
        return element;
    }

    @Override
    public String removeElement(String element) {
        collection.remove(element);
        return element;
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
    public ArrayList<String> getCollection() {
        return collection;
    }

    @Override
    public void setCollection(ArrayList<String> collection) {
        this.collection = collection;
    }

    @Override
    public ArrayList<String> updateElementInCollection(ArrayList<String> oldValue, ArrayList<String> newValue) {
        return null;
    }

    @Override
    public int indexOfElement(String element) {
        return 0;
    }

    @Override
    public ArrayList<String> getReversedCollection() {
        return null;
    }

    @Override
    public int compareWithOtherCollection(ArrayList<String> otherCollection) {
        return 0;
    }

    @Override
    public ArrayList<String> cloneTheCollection(ArrayList<String> otherCollection) {
        return null;
    }

    @Override
    public String toString() {
        return "The following class contains collection:" +
                this.collection.toString();
    }
}
