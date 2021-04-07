package com.varchenko.collections;

public interface CollectionsExecutor<K, T extends Iterable<K>> {
    /**
     * @param amountOfElements int. Amount of elements to be set in the collection. Used to validate the input for some reason.
     * @param collection       contains the element to be inserted into the following.
     * @return true if the operation succeeds.
     * @throws IllegalArgumentException if the amount of elements are not equal to the java.util.Collection#size
     * @implNote The collection link should remain the same!
     */
    boolean fillCollectionWithElements(int amountOfElements, T collection);

    K addElement(K element);

    K removeElement(K element);

    boolean checkIfElementExist(K element);

    /**
     * Clears the collection but remains a link.
     *
     * @return true when collection if empty.
     */
    boolean trimTheCollection();

    T getCollection();

    void setCollection(T collection);

    /**
     * @param oldValue old value to replace.
     * @param newValue new value to set.
     * @return new value
     * @implNote Position of the element should remain the same.
     */
    T updateElementInCollection(T oldValue, T newValue);

    /**
     * @param element to find.
     * @return int first position of the element counting from 0. If element isn't present, returns -1
     */
    int indexOfElement(K element);

    /**
     * @return reversed collection.
     * @implNote The collection link should remain the same!
     */
    T getReversedCollection();

    /**
     * @param otherCollection collection to compareWith.
     * @return amount of the same elements.
     */
    int compareWithOtherCollection(T otherCollection);

    /**
     * @param otherCollection will be the new state of the collection. All previous elements should be deleted.
     * @return a new collection after it's being set.
     */
    T cloneTheCollection(T otherCollection);
}
