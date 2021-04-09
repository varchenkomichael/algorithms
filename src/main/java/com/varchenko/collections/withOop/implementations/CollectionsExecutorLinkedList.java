package com.varchenko.collections.withOop.implementations;

import com.varchenko.collections.withOop.CollectionsExecutor;

import java.util.LinkedList;

public class CollectionsExecutorLinkedList<T> implements CollectionsExecutor<T, LinkedList<T>> {

    @Override
    public boolean fillCollectionWithElements(int amountOfElements, LinkedList<T> collection) {
        return false;
    }

    @Override
    public T addElement(T element) {
        return null;
    }

    @Override
    public T removeElement(T element) {
        return null;
    }

    @Override
    public boolean checkIfElementExist(T element) {
        return false;
    }

    @Override
    public boolean trimCollection() {
        return false;
    }

    @Override
    public LinkedList<T> updateElementInCollection(LinkedList<T> oldValue, LinkedList<T> newValue) {
        return null;
    }

    @Override
    public int indexOfElement(T element) {
        return 0;
    }

    @Override
    public LinkedList<T> getReversedCollection() {
        return null;
    }

    @Override
    public int compareWithOtherCollection(LinkedList<T> otherCollection) {
        return 0;
    }

    @Override
    public LinkedList<T> cloneTheCollection(LinkedList<T> otherCollection) {
        return null;
    }

    @Override
    public LinkedList<T> getCollection() {
        return null;
    }

    @Override
    public void setCollection(LinkedList<T> collection) {

    }
}
