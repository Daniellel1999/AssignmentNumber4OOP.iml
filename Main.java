package set;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * A class to demonstrate the methods implemented in SimpleSet and SetUtils classes.
 */
public class Main {

    public static void main(String[] args) {

        // Creates the first set
        SimpleSet<Integer> setA = new SimpleSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(8);

        // Creates the second set
        SimpleSet<Integer> setB = new SimpleSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        // Prints the sets before making any changes
        System.out.println("The first set is: " + setA);
        System.out.println("The second set is: " + setB);

        // Prints the set's size before making any changes
        System.out.println("The size of the first set is: " + setA.size());
        System.out.println("The size of the second set is: " + setB.size());

        // Checks whether the set contains a specific element
        boolean isContains = setA.contains(2);
        System.out.println("Does the set contain the number 2? " + isContains);

        // Removes an element from the set
        boolean isRemoved = setA.remove(2);
        System.out.println("Is the number 3 removed from the set? " + isRemoved);

        // Union of the two sets
        SimpleSet<Integer> unionSet = SetUtils.union(setA, setB);
        System.out.println("The union set is: " + unionSet);

        // Intersection of the two sets
        SimpleSet<Integer> intersectionSet = SetUtils.intersection(setA, setB);
        System.out.println("The intersection set is: " + intersectionSet);

        // Difference between the two sets
        SimpleSet<Integer> differenceSet = SetUtils.difference(setA, setB);
        System.out.println("The difference set is: " + differenceSet);

        // Symmetric difference between the two sets
        SimpleSet<Integer> symmetricDifferenceSet = SetUtils.symmetricDifference(setA, setB);
        System.out.println("The symmetric difference set is: " + symmetricDifferenceSet);

        System.out.println("-------------------");

        SimpleSet<String> setC = new SimpleSet<>();

        setC.add("hello");
        setC.add("it's");
        setC.add("me");

        SimpleSet<String> setD = new SimpleSet<>();

        setD.add("how");
        setD.add("are");
        setD.add("you");
        setD.add("me");

        // Prints the sets before making any changes
        System.out.println("The third set is: " + setC);
        System.out.println("The forth set is: " + setD);

        // Prints the set's size before making any changes
        System.out.println("The size of the third set is: " + setC.size());
        System.out.println("The size of the forth set is: " + setD.size());

        // Checks whether the set contains a specific element
        boolean isContains2 = setC.contains("hello");
        System.out.println("Does the set contain the number 2? " + isContains2);

        // Removes an element from the set
        boolean isRemoved2 = setC.remove("you");
        System.out.println("Is the number 3 removed from the set? " + isRemoved2);

        // Union of the two sets
        SimpleSet<String> unionSet2 = SetUtils.union(setC, setD);
        System.out.println("The union set is: " + unionSet2);

        // Intersection of the two sets
        SimpleSet<String> intersectionSet2 = SetUtils.intersection(setC, setD);
        System.out.println("The intersection set is: " + intersectionSet2);

        // Difference between the two sets
        SimpleSet<String> differenceSet2 = SetUtils.difference(setC, setD);
        System.out.println("The difference set is: " + differenceSet2);

        // Symmetric difference between the two sets
        SimpleSet<String> symmetricDifferenceSet2 = SetUtils.symmetricDifference(setC, setD);
        System.out.println("The symmetric difference set is: " + symmetricDifferenceSet2);


        System.out.println("-------------------");

        SimpleSet<String> setE = new SimpleSet<>();

        // Check if the sets are empty
        System.out.println("Is the first set empty? " + setA.isEmpty());
        System.out.println("Is the second set empty? " + setB.isEmpty());
        System.out.println("Is the third set empty? " + setC.isEmpty());
        System.out.println("Is the fourth set empty? " + setD.isEmpty());
        System.out.println("Is the fourth set empty? " + setE.isEmpty());

    }
}
