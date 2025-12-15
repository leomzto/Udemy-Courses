public class Exercise14 {

    public static void main(String[] args) {

        // Initializing a string
        String myString = "Hello World!";

        // Using .length() method to get the length of the string
        System.out.println("Length   of myString: " + myString.length()); // Output: 12

        // Using .charAt() method to get a character at a specific index
        System.out.println("Character at index 8: " + myString.charAt(8)); // Output: 'r'

        // Using .substring() method to get a part of the string
        System.out.println("Substring from index 3 to 8: " + myString.substring(3, 8)); // Output: "lo Wo"

        // Using .contains() method to check if the string contains a sequence
        System.out.println("Does myString contain 'lo'? " + myString.contains("lo")); // Output: true

        // Using .indexOf() method to find the position of a character
        System.out.println("Index of 'l': " + myString.indexOf('l')); // Output: 2

        // Using .lastIndexOf() to find the last position of a character
        System.out.println("Last index of 'l': " + myString.lastIndexOf('l')); // Output: 9

        // Using .startsWith() to check if the string starts with a specified prefix
        System.out.println("Does myString start with 'Hello'? " + myString.startsWith("Hello")); // Output: true

        // Using .endsWith() to check if the string ends with a specified suffix
        System.out.println("Does myString end with 'World!'? " + myString.endsWith("World!")); // Output: true

        // Converting to lower case
        System.out.println("myString in lowercase: " + myString.toLowerCase()); // Output: "hello world!"

        // Converting to upper case
        System.out.println("myString in uppercase: " + myString.toUpperCase()); // Output: "HELLO WORLD!"

        // Trimming whitespace from the beginning and end of the string
        String myTrimmedString = "    Hello    ";
        System.out.println("Trimmed string: '" + myTrimmedString.trim() + "'"); // Output: 'Hello'

        // Replacing characters in the string
        System.out.println("Replace 'e' with 'a': " + myString.replace('e', 'a')); // Output: "Hallo World!"

        // Checking if the string is empty
        String emptyString = "";
        System.out.println("Is emptyString empty? " + emptyString.isEmpty()); // Output: true

    }

}

