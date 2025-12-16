package Section8_ArrayLists;

import java.util.ArrayList;

public class Exercise24 {

    public static void main(String[] args) {

        // Initializing an ArrayList of Integer type
        ArrayList<Integer> myList = new ArrayList<>();

        // Example: Adding elements
        myList.add(1); // Adds 1 at the end of the list
        myList.add(2); // Adds 2 at the end of the list
        myList.add(3); // Adds 3 at the end of the list
        System.out.println("After adding elements: " + myList);
        // Output: [1, 2, 3]

        // Example: Inserting at specific index
        myList.add(1, 99); // Inserts 99 at index 1
        System.out.println("After inserting 99 at index 1: " + myList);
        // Output: [1, 99, 2, 3]

        // Example: Accessing elements
        Integer num = myList.get(2); // Accesses element at index 2
        System.out.println("Element at index 2: " + num);
        // Output: 2

        // Example: Modifying elements
        myList.set(2, 100); // Sets the element at index 2 to 100
        System.out.println("After setting index 2 to 100: " + myList);
        // Output: [1, 99, 100, 3]

        // Example: Removing elements
        myList.remove(1); // Removes the element at index 1
        System.out.println("After removing element at index 1: " + myList);
        // Output: [1, 100, 3]

        // Example: Checking if the list is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);
        // Output: false

        // Example: Finding the size of the ArrayList
        int size = myList.size();
        System.out.println("Size of ArrayList: " + size);
        // Output: 3

        // Example: Clearing the ArrayList
        myList.clear();
        System.out.println("After clearing the ArrayList: " + myList);
        // Output: []

        // Example: Checking contains
        myList.add(1);
        myList.add(2);
        myList.add(3);
        boolean containsThree = myList.contains(3);
        System.out.println("Does the list contain 3? " + containsThree);
        // Output: true

    }

}


