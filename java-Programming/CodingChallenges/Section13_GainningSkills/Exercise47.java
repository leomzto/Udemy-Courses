package CodingChallenges.Section13_GainningSkills;

import java.util.HashMap;
import java.util.Map;


public class Exercise47 {

    public static boolean isAnagram(String string1, String string2) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Return true if string1 and string2 are
        // anagrams of each other.
        //
        // Use HashMap with get() and null checks.
        // Do not use any sort methods.
        // ----------------------------------------

        if (string1.length() != string2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : string1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : string2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        return map1.equals(map2);
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"listen\", \"silent\" → " +
                isAnagram("listen", "silent"));  // true

        System.out.println("\"hello\", \"world\" → " +
                isAnagram("hello", "world"));    // false

        System.out.println("\"anagram\", \"nagaram\" → " +
                isAnagram("anagram", "nagaram")); // true

        System.out.println("\"rat\", \"car\" → " +
                isAnagram("rat", "car"));        // false

        System.out.println("\"aacc\", \"ccac\" → " +
                isAnagram("aacc", "ccac"));      // false
    }

}

