package Section7_Arrays;

public class Exercise23 {

    public static void main(String[] args) {

        // Example of looping over a string with a traditional for loop
        String myString = "Hello";
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            System.out.println(c);
        }

        // Example of using a for-each loop to iterate over characters in a string
        // This method first converts the string into a char array
        System.out.println("Using for-each loop:");
        for (char c : myString.toCharArray()) {
            System.out.println(c);
        }

        // Example of looping over an array with a traditional for loop
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Using traditional for loop on an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        // Example of using a for-each loop to iterate over an array
        System.out.println("Using for-each loop on an array:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Notes on when to use each type of loop:
        // Use traditional for loops when you need access to the index during iteration.
        // For-each loops are ideal when you do not need the index and just need to process elements.

        // For-each loops are generally preferred for readability and reducing error
        // (such as off-by-one errors), especially when working with collections and arrays.

    }

}

