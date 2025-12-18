package CodingChallenges.Section13_GainningSkills;

import java.util.ArrayList;
import java.util.List;

public class Exercise48 {

    public static String reverseWords(String sentence) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Reverse the order of words in the string.
        //
        // - Remove extra spaces
        // - Do not use split() or trim()
        //
        // Example:
        // "the sky is blue" → "blue is sky the"
        // ----------------------------------------

        List<String> words = new ArrayList<>();
        int start = 0;
        int spaceIndex;

        while ((spaceIndex = sentence.indexOf(' ', start)) != -1) {
            words.add(sentence.substring(start, spaceIndex));
            start = spaceIndex + 1;
        }
        words.add(sentence.substring(start));

        for (int i = words.size() - 1; i >= 0; i--) {
            if (words.get(i).isEmpty()) {
                words.remove(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for ( int i = words.size() - 1; i >= 0; i--) {
            if (i != 0)
                sb.append(words.get(i)).append(" ");
            else
                sb.append(words.get(i));
        }

        //System.out.println(words);

        return sb.toString();

    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"the sky is blue\" → " +
                reverseWords("the sky is blue"));  // blue is sky the

        System.out.println("\"  hello world  \" → " +
                reverseWords("  hello world  "));  // world hello

        System.out.println("\"a good   example\" → " +
                reverseWords("a good   example"));  // example good a

        System.out.println("\"  Bob    Loves  Alice   \" → " +
                reverseWords("  Bob    Loves  Alice   "));  // Alice Loves Bob

        System.out.println("\"Alice does not even like bob\" → " +
                reverseWords("Alice does not even like bob"));
        // bob like even not does Alice
    }

}
