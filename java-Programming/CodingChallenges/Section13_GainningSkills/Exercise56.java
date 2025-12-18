package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise56 {

    public static int[] twoSum(int[] nums, int target) {
        // -------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method returns the indices of the two numbers in
        // the array that add up to the target value.
        //
        // It uses a HashMap to track visited numbers and their
        // indices to find the match in a single loop.
        // -------------------------------------------------------

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;

    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " + Arrays.toString(twoSum(
                new int[]{2, 7, 11, 15}, 9)));       // [0, 1]

        System.out.println("→ " + Arrays.toString(twoSum(
                new int[]{3, 2, 4}, 6)));            // [1, 2]

        System.out.println("→ " + Arrays.toString(twoSum(
                new int[]{3, 3}, 6)));               // [0, 1]

        System.out.println("→ " + Arrays.toString(twoSum(
                new int[]{1, 5, 3, 4}, 9)));         // [1, 3]

        System.out.println("→ " + Arrays.toString(twoSum(
                new int[]{10, 20, 30}, 50)));        // [1, 2]
    }

}

