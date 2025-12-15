public class Exercise12 {

    public static void main(String[] args) {

        // Define a string to work with
        String myString = "Hello World!";

        // Print the original string
        System.out.println("Original string: " + myString);

        // Accessing single characters
        System.out.println("Character at position 8: " + myString.charAt(8));  // Outputs 'r'

        // Length of the string
        System.out.println("Length of string: " + myString.length());  // Outputs '12'

        // Using substring to get a part of the string
        System.out.println("Substring from index 3: " + myString.substring(3));  // Outputs "lo World!"
        System.out.println("Substring from index 3 to 8: " + myString.substring(3, 8));  // Outputs "lo Wo"

        // Demonstrating how to handle the last character
        System.out.println("Last character: " + myString.charAt(myString.length() - 1));  // Outputs '!'

        // More examples with other strings
        String myString2 = "hello";
        String myString3 = "3.141592";
        String myString4 = "!@#$%^&*()_=+{}\\|,;<,>.?/";

        // Print examples of substrings from other strings
        System.out.println("Substring of myString2 from index 1 to 4: " + myString2.substring(1, 4));  // Outputs "ell"
        System.out.println("Substring of myString3 up to index 4: " + myString3.substring(0, 4));  // Outputs "3.14"
        System.out.println("Substring of myString4: " + myString4.substring(10, 15));  // Outputs "_=+{}"

        // Creating a new string from a substring
        String newString = myString.substring(6, 11);
        System.out.println("New string from myString: " + newString);  // Outputs "World"

    }

}

