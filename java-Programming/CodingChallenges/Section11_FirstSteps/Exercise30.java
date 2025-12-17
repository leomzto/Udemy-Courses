package CodingChallenges.Section11_FirstSteps;

public class Exercise30 {

    public static int maximum(int a, int b) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given two integers, return the one that
        // is greater. If both numbers are equal,
        // return either one.
        // ----------------------------------------
        if (a == b) return a;

        return a > b ? a : b;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("Max of 10 and 20 is " +
                maximum(10, 20));    // 20

        System.out.println("Max of 8 and 4 is " +
                maximum(8, 4));      // 8

        System.out.println("Max of -5 and -2 is " +
                maximum(-5, -2));    // -2

        System.out.println("Max of 7 and 7 is " +
                maximum(7, 7));      // 7

    }

}

