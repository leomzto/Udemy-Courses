package Section6_Loops;

public class Exercise21 {

    public static void main(String[] args) {

        // Demonstrating nested for loops

        // Outer loop runs from 0 to 1 (inclusive)
        for (int i = 0; i < 2; i++) {
            // Inner loop also runs from 0 to 1 (inclusive)
            for (int j = 0; j < 2; j++) {
                // Print the current values of i and j
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Explanation of how nested loops work:
        // The outer loop sets an initial condition and iterates over it.
        // For each iteration of the outer loop, the inner loop runs completely from start to finish.
        // This results in the inner loop running multiple times for each single iteration of the outer loop.

    }

}
