public class Exercise17 {

    public static void main(String[] args) {

        // Initialize a variable to use in if statements
        int myInt = 5;

        // Simple if statement: checks if myInt equals 5
        // Executes the block if the condition is true
        if (myInt == 5) {
            System.out.println("myInt equals 5");
        }

        // If-else statement: checks the condition and executes the first block if true
        // If the condition is false, it executes the else block
        myInt = 4;
        if (myInt == 5) {
            System.out.println("myInt equals 5");
        } else {
            System.out.println("myInt is not 5");
        }

        // If-else-if statement: provides multiple conditional checks
        // Only one block is executed: the first one where the condition is true
        if (myInt == 5) {
            System.out.println("myInt equals 5");
        } else if (myInt == 4) {
            System.out.println("myInt equals 4");
        } else {
            System.out.println("myInt is not 4 or 5");
        }

        // Using logical operators to check multiple conditions in an if statement
        // Here, both conditions need to be true due to the AND operator (&&)
        int anotherInt = 6;
        if (myInt == 4 && anotherInt == 6) {
            System.out.println("myInt is 4 and anotherInt is 6");
        }

        // Using a string in if statements to check if the string is empty
        String myString = "Hello";
        if (myString.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }

        // Nested if statements: an if statement inside another if statement
        // Checks if myInt is less than 10 and then if it's greater than 3
        if (myInt < 10) {
            if (myInt > 3) {
                System.out.println("myInt is less than 10 and greater than 3");
            }
        }

    }

}

