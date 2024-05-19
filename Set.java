package set;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * An interface that represents a set, which is a collection of unique elements.
 *
 * @param <E> the type of elements in the set
 */
public interface Set<E> {

    /**
     * Adds the specified element to the set if it is not already present.
     *
     * @param element the element to be added
     * @return {@code true} if the element was added, {@code false} otherwise
     */
    boolean add(E element);

    /**
     * Removes the specified element from the set if it is present.
     *
     * @param element the element to be removed
     * @return {@code true} if the element was removed, {@code false} otherwise
     */
    boolean remove(E element);

    /**
     * Checks if the set contains the specified element.
     *
     * @param element the element to be checked for containment
     * @return {@code true} if the set contains the element, {@code false} otherwise
     */
    boolean contains(E element);

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set
     */
    int size();

    /**
     * Checks if the set is empty (contains no elements).
     *
     * @return {@code true} if the set is empty, {@code false} otherwise
     */
    boolean isEmpty();
}
