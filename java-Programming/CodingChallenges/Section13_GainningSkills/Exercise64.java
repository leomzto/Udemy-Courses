package CodingChallenges.Section13_GainningSkills;

import java.util.HashSet;

public class Exercise64 {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // só começa se for o início da sequência
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));   // 4

        System.out.println("→ " +
                longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1})); // 9

        System.out.println("→ " +
                longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6})); // 7

        System.out.println("→ " +
                longestConsecutive(new int[]{}));   // 0

        System.out.println("→ " +
                longestConsecutive(new int[]{1}));  // 1
    }

}

