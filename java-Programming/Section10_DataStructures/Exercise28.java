package Section10_DataStructures;

// Importing necessary libraries for Map operations
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Exercise28 {

    public static void main(String[] args) {

        // Initializing a HashMap
        // HashMap does not maintain any order of elements
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 27);

        // Demonstrating how elements are stored randomly
        System.out.println("HashMap of ages: " + ages);

        // Accessing a value using a key
        Integer ageOfBob = ages.get("Bob");
        System.out.println("Bob's age: " + ageOfBob);  // Outputs 25

        // Checking if a key exists in the map
        boolean hasAlice = ages.containsKey("Alice");
        System.out.println("Does Alice exist in the map? " + hasAlice);  // Outputs true

        // Checking if a value exists in the map
        boolean hasAge27 = ages.containsValue(27);
        System.out.println("Is there someone aged 27? " + hasAge27);  // Outputs true

        // Removing an entry from the map
        ages.remove("Charlie");
        System.out.println("Map after removing Charlie: " + ages);

        // Getting the size of the map
        int size = ages.size();
        System.out.println("Number of entries in the map: " + size);  // Outputs 2

        // Checking if the map is empty
        boolean isEmpty = ages.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);  // Outputs false

        // Clearing all entries from the map
        ages.clear();
        System.out.println("Map after clear operation: " + ages);  // Outputs {}

        // Working with TreeMap
        // TreeMap sorts the keys in natural order
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "ten");
        treeMap.put(5, "five");
        treeMap.put(20, "twenty");
        System.out.println("TreeMap contents: " + treeMap);

        // Working with LinkedHashMap
        // LinkedHashMap maintains the order of insertion
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");
        System.out.println("LinkedHashMap contents: " + linkedHashMap);
    }

}

