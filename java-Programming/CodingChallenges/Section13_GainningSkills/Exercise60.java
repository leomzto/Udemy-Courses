package CodingChallenges.Section13_GainningSkills;

import java.util.HashSet;

public class Exercise60 {

    public static boolean isPangram(String sentence) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method checks whether a given string is a pangram.
        // A pangram contains all 26 letters of the alphabet at least once.
        //
        // It uses a HashSet to collect each letter found.
        // ------------------------------------------------------------

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //System.out.println("letters: " + alphabet.length());

        HashSet<Character> alphabetSet = new HashSet<>();
        HashSet<Character> pangramSet = new HashSet<>();


        for (char ch : alphabet.toCharArray()) {
            alphabetSet.add(ch);

            for (char ch2 : sentence.toCharArray()) {
                if (alphabetSet.contains(ch2)) {
                    pangramSet.add(ch2);
                }
            }
        }


        return pangramSet.size() == alphabetSet.size();

    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                isPangram("the quick brown fox jumps over the lazy dog"));  // true

        System.out.println("→ " +
                isPangram("hello world"));                                  // false

        System.out.println("→ " +
                isPangram("abcdefghijklmnopqrstuvwxyz"));                   // true

        System.out.println("→ " +
                isPangram("missing letters here"));                         // false

        System.out.println("→ " +
                isPangram("pack my box with five dozen liquor jugs"));      // true
    }

}

