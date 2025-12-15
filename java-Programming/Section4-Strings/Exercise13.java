public class Exercise13 {

    public static void main(String[] args) {

        String myString = "Hello World!";

        // Task 1: Print the character at index 8 (9th position in the string)
        char task1 = myString.charAt(8);
        System.out.println(task1);  // Output: r

        // Task 2: Print the last character in the string
        char task2 = myString.charAt(myString.length() - 1);
        System.out.println(task2);  // Output: !

        // Task 3: Print the second-to-last character in the string
        char task3 = myString.charAt(myString.length() - 2);
        System.out.println(task3);  // Output: d

        // Task 4: Print the characters from index 3 to 7
        String task4 = myString.substring(3, 8);
        System.out.println(task4);  // Output: lo Wo

        // Task 5: Print the first 8 characters of the string
        String task5 = myString.substring(0, 8);
        System.out.println(task5);  // Output: Hello Wo

        // Task 6: Print characters from index 3 to the end of the string
        String task6 = myString.substring(3);
        System.out.println(task6);  // Output: lo World!

        // Task 7: Print characters from 9th-to-last to the 4th-to-last index
        String task7 = myString.substring(myString.length() - 9, myString.length() - 4);
        System.out.println(task7);  // Output: lo Wo

        // Task 8: Print the entire string except for the last 4 characters
        String task8 = myString.substring(0, myString.length() - 4);
        System.out.println(task8);  // Output: Hello Wo

        // Task 9: Print the last 9 characters from the string
        String task9 = myString.substring(3);
        System.out.println(task9);  // Output: lo World!

        // Task 10: Print characters from index 3 to the 4th-to-last index (exclusive)
        String task10 = myString.substring(3, myString.length() - 4);
        System.out.println(task10);  // Output: lo Wo

    }

}

