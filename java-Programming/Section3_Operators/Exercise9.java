package Section3_Operators;

public class Exercise9 {

    public static void main(String[] args) {

        // AND operator (&&) examples
        System.out.println("5 == 5 && 4 == 4: " + (5 == 5 && 4 == 4)); // Output: true
        System.out.println("5 == 5 && 4 > 5: " + (5 == 5 && 4 > 5)); // Output: false
        System.out.println("false && true: " + (false && true)); // Output: false
        System.out.println("true && false: " + (true && false)); // Output: false

        // OR operator (||) examples
        System.out.println("5 == 5 || 4 == 4: " + (5 == 5 || 4 == 4)); // Output: true
        System.out.println("5 == 4 || 4 == 4: " + (5 == 4 || 4 == 4)); // Output: true
        System.out.println("false || true: " + (false || true)); // Output: true
        System.out.println("false || false: " + (false || false)); // Output: false

        // NOT operator (!) examples
        System.out.println("!(5 == 5): " + !(5 == 5)); // Output: false
        System.out.println("!true: " + !true); // Output: false
        System.out.println("!false: " + !false); // Output: true

        // Combination of logical operators
        System.out.println("true || !false && false: " + (true || !false && false)); // Output: true
        System.out.println("(true || !false) && false: " + ((true || !false) && false)); // Output: false
        System.out.println("true && !false: " + (true && !false)); // Output: true
        System.out.println("false || (true && false): " + (false || (true && false))); // Output: false

        // Demonstrating the order of precedence
        boolean a = true, b = false;
        System.out.println("Expression: !b && a || b");
        System.out.println("!b && a || b: " + (!b && a || b)); // Evaluates !b first, then &&, then ||

        // Adding parentheses to change the order of evaluation
        System.out.println("Expression with changed precedence: (!b && a) || b");
        System.out.println("(!b && a) || b: " + ((!b && a) || b)); // Same result, shows && before ||

        System.out.println("Expression with different precedence: !(b && a) || b");
        System.out.println("!(b && a) || b: " + (!(b && a) || b)); // Now ! has the highest impact

    }

}

