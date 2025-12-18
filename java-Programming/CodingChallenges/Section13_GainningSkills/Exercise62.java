package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise62 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method returns the intersection of two integer arrays,
        // including duplicates. The result may be in any order.
        //
        // Use a HashMap to count frequencies of the first array,
        // then match elements from the second array.
        // ------------------------------------------------------------
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for (int element : nums1) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (int element : nums2) {
            if (map.getOrDefault(element, 0) >= 1) {
                list.add(element);
                map.put(element, map.get(element) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        
        //System.out.println("map: " + map);
        //System.out.println("result: " + Arrays.toString(result));

        return result;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " + Arrays.toString(
                intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})
        ));  // [2, 2]

        System.out.println("→ " + Arrays.toString(
                intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})
        ));  // [4, 9]

        System.out.println("→ " + Arrays.toString(
                intersect(new int[]{1, 1, 1}, new int[]{1, 1})
        ));  // [1, 1]

        System.out.println("→ " + Arrays.toString(
                intersect(new int[]{3}, new int[]{1, 2, 3})
        ));  // [3]

        System.out.println("→ " + Arrays.toString(
                intersect(new int[]{7, 8, 9}, new int[]{10, 11})
        ));  // []
    }

}

