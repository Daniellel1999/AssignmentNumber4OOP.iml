package set;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

import java.util.Arrays;

/**
 * A simple implementation of the Set interface using an array.
 *
 * @param <E> the type of elements in the set
 */
public class SimpleSet<E> implements Set<E> {
    private E[] elements;
    private int size;
    private int capacity;

    /**
     * Constructs a SimpleSet with the specified capacity.
     *
     * @param capacity the initial capacity of the set
     */
    public SimpleSet(int capacity) {
        this.elements = (E[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    /**
     * Constructs a SimpleSet with a default capacity of 5.
     */
    public SimpleSet() {
        this(5);
    }

    /**
     * Adds the specified element to the set if it is not already present.
     *
     * @param e the element to be added to the set
     * @return {@code true} if the element was added, {@code false} otherwise
     */
    @Override
    public boolean add(E e) {
        if (!contains(e)) {
            if (size >= capacity) {
                int newCapacity = capacity + 5;
                elements = Arrays.copyOf(elements, newCapacity);
                capacity = newCapacity;
            }

            elements[size] = e;
            size++;
            return true;
        }
        return false;
    }

    /**
     * Removes the specified element from the set if it is present.
     *
     * @param e the element to be removed from the set
     * @return {@code true} if the element was removed, {@code false} otherwise
     */
    @Override
    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the set contains the specified element.
     *
     * @param e the element to be checked for presence in the set
     * @return {@code true} if the set contains the element, {@code false} otherwise
     */
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks whether the set is empty.
     *
     * @return {@code true} if the set is empty, {@code false} otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the array of elements in the set.
     *
     * @return the array of elements in the set
     */
    public E[] getElements() {
        return elements;
    }

    /**
     * Returns a string representation of the set.
     *
     * @return a string representation of the set
     */
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
