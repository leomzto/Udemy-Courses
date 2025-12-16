package Section9_Methods;

/**
 * Class to demonstrate various scopes of variables in Java as detailed in the PPT.
 * This class includes examples of local variables, class-level variables, and
 * variables within different control structures, as well as detailed method-level scope.
 */

public class Exercise26 {

    // Class-level static variable
    static String classVar = "Hello, Java!";


    public static void main(String[] args) {
        // Local variable in the main method
        String localVarMain = "Hello, World!";
        System.out.println("Local variable in main method: " + localVarMain);

        // Accessing a static method that demonstrates method-level scope
        displayMessage();

        // Demonstrate control structure scopes
        demonstrateControlStructures();
    }


    /**
     * Static method to display a message, showcasing method-level scope.
     */
    static void displayMessage() {
        // Local variable specific to the displayMessage method
        String localVar = "Hello from displayMessage!";
        System.out.println(localVar);
    }


    /**
     * Method to demonstrate variable scope within different control structures.
     */
    static void demonstrateControlStructures() {
        // Variable local to this method, accessible within any control structures below
        int outerVariable = 10;

        // Demonstrating scope within an if statement
        if (outerVariable > 5) {
            int innerIfVariable = 20;  // Scoped to this if block
            System.out.println("Inside if-block: " + innerIfVariable);
        }

        // Demonstrating scope within a while loop
        while (outerVariable > 5) {
            int innerWhileVariable = 30;  // Scoped to this while loop
            System.out.println("Inside while-loop: " + innerWhileVariable);
            outerVariable--;
        }

        // Demonstrating scope within a for loop
        for (int i = 0; i < 5; i++) {
            int innerForVariable = 40;  // Scoped to this for loop
            System.out.println("Inside for-loop, variable: " + innerForVariable);
        }
        // Variables innerIfVariable, innerWhileVariable, and innerForVariable are not accessible here
    }

}

