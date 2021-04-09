package com.varchenko.collections.withOop.implementations;

import com.varchenko.collections.withOop.CollectionsExecutor;

import java.util.ArrayList;

public class CollectionsExecutorArrayList<T> implements CollectionsExecutor<T, ArrayList<T>> {
    private ArrayList<T> collection;

    CollectionsExecutorArrayList() {
        this.collection = new ArrayList<>();
    }

    @Override
    public boolean fillCollectionWithElements(int amountOfElements, ArrayList<T> collection) {
        return false;
    }

    @Override
    public T addElement(T element) {
        collection.add(element);
        return element;
    }

    @Override
    public T removeElement(T element) {
        collection.remove(element);
        return element;
    }

    @Override
    public boolean checkIfElementExist(T element) {
        return collection.indexOf(element) != -1;
    }

    @Override
    public boolean trimCollection() {
        collection.clear();
        return true;
    }

    @Override
    public ArrayList<T> getCollection() {
        return null;
    }

    @Override
    public void setCollection(ArrayList<T> collection) {

    }

    @Override
    public ArrayList<T> updateElementInCollection(ArrayList<T> oldValue, ArrayList<T> newValue) {
        return null;
    }

    @Override
    public int indexOfElement(T element) {
        return 0;
    }

    @Override
    public ArrayList<T> getReversedCollection() {
        return null;
    }

    @Override
    public int compareWithOtherCollection(ArrayList<T> otherCollection) {
        return 0;
    }

    @Override
    public ArrayList<T> cloneTheCollection(ArrayList<T> otherCollection) {
        return null;
    }
}
