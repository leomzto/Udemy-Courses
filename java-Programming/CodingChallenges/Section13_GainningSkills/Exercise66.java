package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise66 {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            count += map.getOrDefault(prefixSum - k, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                subarraySum(new int[]{1, 1, 1}, 2));                // 2

        System.out.println("→ " +
                subarraySum(new int[]{1, 2, 3}, 3));                // 2

        System.out.println("→ " +
                subarraySum(new int[]{-1, -1, 1}, 0));              // 1

        System.out.println("→ " +
                subarraySum(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7)); // 4

        System.out.println("→ " +
                subarraySum(new int[]{1}, 0));                      // 0
    }

}

