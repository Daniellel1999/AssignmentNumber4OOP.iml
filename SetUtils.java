package set;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Utility class for performing set operations on SimpleSet objects.
 */
public class SetUtils {


    /**
     * Computes the union of two sets.
     *
     * @param setA the first set
     * @param setB the second set
     * @param <E>  the type of elements in the sets
     * @return a new SimpleSet containing the elements from both sets without duplicates
     */
    public static <E> SimpleSet<E> union(SimpleSet<E> setA, SimpleSet<E> setB) {

        SimpleSet<E> unionSet = new SimpleSet<>(setA.size() + setB.size());
        for (int i = 0; i < setA.size(); i++) {
            unionSet.add(setA.getElements()[i]);
        }

        for (int i = 0; i < setB.size(); i++) {
            if (!(unionSet.contains(setB.getElements()[i]))) {
                unionSet.add(setB.getElements()[i]);
            }
        }
        // Create a new set without null elements
        SimpleSet<E> newSet = new SimpleSet<>(unionSet.size());
        for (int i = 0; i < unionSet.size(); i++) {
            E element = unionSet.getElements()[i];
            if (element != null) {
                newSet.add(element);
            }
        }

        return newSet;
    }

    /**
     * Computes the intersection of two sets.
     *
     * @param setA the first set
     * @param setB the second set
     * @param <E>  the type of elements in the sets
     * @return a new SimpleSet containing the common elements present in both sets
     */
    public static <E> SimpleSet<E> intersection(SimpleSet<E> setA, SimpleSet<E> setB) {

        int newSize = Math.min(setA.size(), setB.size());
        SimpleSet<E> intersectionSet = new SimpleSet<>(newSize);

        for (int i = 0; i < newSize; i++) {
            E element = setA.getElements()[i];
            if (setB.contains(element)) {
                intersectionSet.add(element);
            }
        }

        // Create a new set without null elements
        SimpleSet<E> newSet = new SimpleSet<>(intersectionSet.size());
        for (int i = 0; i < intersectionSet.size(); i++) {
            E element = intersectionSet.getElements()[i];
            if (element != null) {
                newSet.add(element);
            }
        }

        return newSet;
    }

    /**
     * Computes the difference between two sets (elements in setA that are not in setB).
     *
     * @param setA the first set
     * @param setB the second set
     * @param <E>  the type of elements in the sets
     * @return a new SimpleSet containing the elements present in setA but not in setB
     */
    public static <E> SimpleSet<E> difference(SimpleSet<E> setA, SimpleSet<E> setB) {

        SimpleSet<E> differenceSet = new SimpleSet<>(setA.size());

        for (int i = 0; i < setA.size(); i++) {
            differenceSet.add(setA.getElements()[i]);
        }

        for (int i = 0; i < setB.size(); i++) {
            if (differenceSet.contains(setB.getElements()[i])) {
                differenceSet.remove(setB.getElements()[i]);
            }
        }

        // Create a new set without null elements
        SimpleSet<E> newSet = new SimpleSet<>(differenceSet.size());
        for (int i = 0; i < differenceSet.size(); i++) {
            E element = differenceSet.getElements()[i];
            if (element != null) {
                newSet.add(element);
            }
        }

        return newSet;
    }

    /**
     * Computes the symmetric difference between two sets (elements in either setA or setB but not both).
     *
     * @param setA the first set
     * @param setB the second set
     * @param <E>  the type of elements in the sets
     * @return a new SimpleSet containing the elements present in either setA or setB but not in both
     */

    public static <E> SimpleSet<E> symmetricDifference(SimpleSet<E> setA, SimpleSet<E> setB) {

        int newSize = setA.size() + setB.size();
        SimpleSet<E> symmetricDifferenceSet = new SimpleSet<>(newSize);

        for (int i = 0; i < setA.size(); i++) {
            symmetricDifferenceSet.add(setA.getElements()[i]);
        }

        for (int i = 0; i < setB.size(); i++) {
            if (!(symmetricDifferenceSet.contains(setB.getElements()[i]))) {
                symmetricDifferenceSet.add(setB.getElements()[i]);
            } else {
                symmetricDifferenceSet.remove(setB.getElements()[i]);
            }
        }

        // Create a new set without null elements
        SimpleSet<E> newSet = new SimpleSet<>(symmetricDifferenceSet.size());
        for (int i = 0; i < symmetricDifferenceSet.size(); i++) {
            E element = symmetricDifferenceSet.getElements()[i];
            if (element != null) {
                newSet.add(element);
            }
        }

        return newSet;
    }
}