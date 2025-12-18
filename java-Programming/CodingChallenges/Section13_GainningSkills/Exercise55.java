package CodingChallenges.Section13_GainningSkills;

import java.util.*;
public class Exercise55  {

    public static int compress(char[] chars) {
        // ------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Compress the character array by replacing
        // repeated characters with the character
        // followed by the count of its repeats.
        //
        // The compression is done in-place and the
        // method returns the new length of the array.
        //
        // If a character appears once, just keep it.
        // ------------------------------------------

        // se um char aparece 11 vezes, exeplo 11x a:
            // 'a', '1', '1' -> "a11"

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<String> keyList = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            keyList.add(String.valueOf(key));
            if (value > 1)
                if (value > 10) {
                    keyList.add(String.valueOf(value / 10));
                    keyList.add(String.valueOf(value % 10));
                }
                else {
                    keyList.add(String.valueOf(value));
                }
        }

        //System.out.println("map: " + map);
        //System.out.println("keyList: " + keyList);

        keyList.toArray(keyList.toArray(new String[0]));

        return keyList.size();
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " + compress(
                new char[]{'a','a','b','b','c','c','c'}));  // 6

        System.out.println("→ " + compress(
                new char[]{'a'}));  // 1

        System.out.println("→ " + compress(
                new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));  // 4

        System.out.println("→ " + compress(
                new char[]{'a','a','a','a','a','a','a','a','a','a','a'}));  // 3

        System.out.println("→ " + compress(
                new char[]{}));  // 0
    }

}

