package CodingChallenges.Section11_FirstSteps;

import java.util.function.Predicate;

public class Exercise35 {

    public static int countEvens(int[] numbers) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // count of how many numbers are even.
        //
        // A number is even if divisible by 2.
        // ----------------------------------------

        Predicate<Integer> isEven = num -> num % 2 == 0;

        int evens = 0;

        for (int n : numbers) {
            if (isEven.test(n)) evens++;
        }

        return evens;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 3, 4, 5] → " +
                countEvens(new int[]{1, 2, 3, 4, 5}));    // 2

        System.out.println("[2, 4, 6, 8] → " +
                countEvens(new int[]{2, 4, 6, 8}));       // 4

        System.out.println("[1, 3, 5, 7] → " +
                countEvens(new int[]{1, 3, 5, 7}));       // 0

        System.out.println("[] → " +
                countEvens(new int[]{}));                 // 0

        System.out.println("[0, 11, 22, 33] → " +
                countEvens(new int[]{0, 11, 22, 33}));    // 2

    }

}

