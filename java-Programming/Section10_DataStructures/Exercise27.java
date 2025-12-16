package Section10_DataStructures;

// Importing necessary libraries for Set and List operations
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Exercise27 {

    public static void main(String[] args) {

        // Example of initializing a HashSet
        Set<Integer> myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        // Duplicates are ignored
        myHashSet.add(2);
        System.out.println("HashSet Elements: " + myHashSet);

        // Example of initializing a TreeSet
        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(3);
        myTreeSet.add(1);
        myTreeSet.add(2);
        System.out.println("TreeSet Elements: " + myTreeSet);

        // Example of initializing a LinkedHashSet
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(2);
        myLinkedHashSet.add(1);
        myLinkedHashSet.add(3);
        System.out.println("LinkedHashSet Elements: " + myLinkedHashSet);

        // Demonstrating various Set operations
        System.out.println("Size of HashSet: " + myHashSet.size());
        System.out.println("HashSet contains 1: " + myHashSet.contains(1));
        myHashSet.remove(3);
        System.out.println("HashSet after removing 3: " + myHashSet);
        System.out.println("Is the HashSet empty? " + myHashSet.isEmpty());
        myHashSet.clear();
        System.out.println("HashSet after clear operation: " + myHashSet);

        // Adding more elements to TreeSet for demonstration
        myTreeSet.add(5);
        myTreeSet.add(4);
        System.out.println("TreeSet after adding 4 and 5: " + myTreeSet);

        // Adding more elements to LinkedHashSet for order maintenance demo
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(4);
        System.out.println("LinkedHashSet after adding 4 and 5: " + myLinkedHashSet);

        // Creating a HashSet from an ArrayList
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);  // Duplicate element
        myList.add(1);  // Duplicate element

        // Initialize a HashSet with the elements of the ArrayList
        Set<Integer> mySetFromList = new HashSet<>(myList);
        System.out.println("HashSet created from ArrayList: " + mySetFromList);
        // This will show {1, 2, 3} demonstrating that duplicates are removed

    }

}