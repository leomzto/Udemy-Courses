package Section3_Operators;

public class Exercise6 {

    public static void main(String[] args) {

        // Demonstrating basic arithmetic operations

        // Addition
        System.out.println("5 + 5 = " + (5 + 5)); // Output: 10
        System.out.println("5 + 5.0 = " + (5 + 5.0)); // Output: 10.0 (note the double precision)

        // Subtraction
        System.out.println("5 - 5 = " + (5 - 5)); // Output: 0
        System.out.println("5 - 5.0 = " + (5 - 5.0)); // Output: 0.0

        // Multiplication
        System.out.println("5 * 5 = " + (5 * 5)); // Output: 25
        System.out.println("5 * 5.0 = " + (5 * 5.0)); // Output: 25.0

        // Division
        System.out.println("5 / 5 = " + (5 / 5)); // Output: 1
        System.out.println("5 / 2 = " + (5 / 2)); // Output: 2 (integer division truncates)
        System.out.println("5 / 2.0 = " + (5 / 2.0)); // Output: 2.5 (floating point division)

        // Modulus
        System.out.println("7 % 2 = " + (7 % 2)); // Output: 1 (remainder of division of 7 by 2)
        System.out.println("7 % 2.0 = " + (7 % 2.0)); // Output: 1.0 (floating point modulus)

        // Increment and Decrement
        int myInt = 8;
        System.out.println("Initial myInt: " + myInt); // Output: 8
        myInt++;
        System.out.println("After increment (myInt++): " + myInt); // Output: 9
        myInt--;
        System.out.println("After decrement (myInt--): " + myInt); // Output: 8

        // Compound Assignment
        myInt += 1;  // myInt = myInt + 1;
        System.out.println("After adding 1 (myInt += 1): " + myInt); // Output: 9
        myInt -= 1;  // myInt = myInt - 1;
        System.out.println("After subtracting 1 (myInt -= 1): " + myInt); // Output: 8
        myInt *= 2;  // myInt = myInt * 2;
        System.out.println("After multiplying by 2 (myInt *= 2): " + myInt); // Output: 16
        myInt /= 2;  // myInt = myInt / 2;
        System.out.println("After dividing by 2 (myInt /= 2): " + myInt); // Output: 8
        myInt %= 3;  // myInt = myInt % 3;
        System.out.println("After modulus 3 (myInt %= 3): " + myInt); // Output: 2

    }

}

