package Section3_Operators;

public class Exercise8 {

    public static void main(String[] args) {

        // Examples of equality and inequality comparisons

        // Equality operator (==)
        System.out.println("5 == 5: " + (5 == 5)); // Output: true
        System.out.println("5 == 4: " + (5 == 4)); // Output: false
        System.out.println("5 == 5.0: " + (5 == 5.0)); // Output: true
        System.out.println("'5' == '5': " + ('5' == '5')); // Output: true
        System.out.println("5 == '5': " + (5 == '5')); // Output: false (int compared to char)

        // Not equal operator (!=)
        System.out.println("5 != 4: " + (5 != 4)); // Output: true
        System.out.println("5 != 5: " + (5 != 5)); // Output: false
        System.out.println("5 != 5.0: " + (5 != 5.0)); // Output: false
        System.out.println("'5' != '5': " + ('5' != '5')); // Output: false
        System.out.println("5 != '5': " + (5 != '5')); // Output: true (int compared to char)

        // Greater than (>)
        System.out.println("5 > 4: " + (5 > 4)); // Output: true
        System.out.println("5 > 5: " + (5 > 5)); // Output: false

        // Less than (<)
        System.out.println("5 < 4: " + (5 < 4)); // Output: false
        System.out.println("5 < 5: " + (5 < 5)); // Output: false

        // Greater than or equal to (>=)
        System.out.println("5 >= 5: " + (5 >= 5)); // Output: true
        System.out.println("5 >= 4: " + (5 >= 4)); // Output: true

        // Less than or equal to (<=)
        System.out.println("5 <= 5: " + (5 <= 5)); // Output: true
        System.out.println("5 <= 4: " + (5 <= 4)); // Output: false

    }

}

