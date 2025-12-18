package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise65 {

    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("→ " +
                groupAnagrams(new String[]{""}));

        System.out.println("→ " +
                groupAnagrams(new String[]{"a"}));

        System.out.println("→ " +
                groupAnagrams(new String[]{"abc", "bca", "cab", "xyz", "zyx"}));

        System.out.println("→ " +
                groupAnagrams(new String[]{}));
    }

}

