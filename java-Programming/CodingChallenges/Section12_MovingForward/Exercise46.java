package CodingChallenges.Section12_MovingForward;

import java.util.*;

public class Exercise46  {

    public static Integer mostCommon(int[] items) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // number that appears most frequently.
        //
        // If the array is empty, return null.
        // ----------------------------------------

        if (items == null || items.length == 0) return null;

        if (items.length == 1) return items[0];

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : items) {
            if (set.contains(item)) {
                map.put(item, map.getOrDefault(item, 1) + 1);
            }
            set.add(item);

        }

        Integer maxKey = null;
        int maxVal = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }


        //System.out.println(map);
        return maxKey;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 2, 3, 3] → " +
                mostCommon(new int[]{1, 2, 2, 3, 3}));

        System.out.println("[5] → " +
                mostCommon(new int[]{5}));

        System.out.println("[] → " +
                mostCommon(new int[]{}));

        System.out.println("[1, 1, 1, 2, 3, 4] → " +
                mostCommon(new int[]{1, 1, 1, 2, 3, 4}));
    }

}

