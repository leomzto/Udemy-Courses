package CodingChallenges.Section12_MovingForward;

import java.util.*;

public class Exercise45  {

    public static List<Integer> findDuplicates(int[] numbers) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return a list
        // of all numbers that appear more than once.
        //
        // Each duplicate should only appear once in
        // the output. Use a Set to track repeats.
        // ----------------------------------------

        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                dup.add(number);
            }
        }

        return new ArrayList<>(dup);
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 2, 3, 4, 4] → " +
                findDuplicates(new int[]{1, 2, 2, 3, 4, 4}));

        System.out.println("[5, 5, 5, 5] → " +
                findDuplicates(new int[]{5, 5, 5, 5}));

        System.out.println("[1, 2, 3] → " +
                findDuplicates(new int[]{1, 2, 3}));

        System.out.println("[7, 8, 9, 7, 8] → " +
                findDuplicates(new int[]{7, 8, 9, 7, 8}));

        System.out.println("[] → " +
                findDuplicates(new int[]{}));

    }

}

