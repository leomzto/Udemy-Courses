package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise58  {

    public static int majorityElement(int[] nums) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Finds the majority element in an array of integers.
        // A majority element is the one that appears more than
        // n / 2 times. It is guaranteed to exist in the input.
        //
        // This solution uses a HashMap to count occurrences.
        // ------------------------------------------------------------

        int n = nums.length;
        int majority = n / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //System.out.println("map: " + map);

        int maxVal = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }

        }

        return maxKey;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                majorityElement(new int[]{3, 2, 3}));           // 3

        System.out.println("→ " +
                majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // 2

        System.out.println("→ " +
                majorityElement(new int[]{1}));                 // 1

        System.out.println("→ " +
                majorityElement(new int[]{5, 5, 5, 5}));         // 5

        System.out.println("→ " +
                majorityElement(new int[]{4, 4, 2, 4}));         // 4
    }

}

