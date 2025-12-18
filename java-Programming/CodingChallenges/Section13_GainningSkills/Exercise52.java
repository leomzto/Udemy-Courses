package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise52 {

    public static boolean isSubsequence(String string1, String string2) {
        // ----------------------------------------------------
        // This method checks if string1 is a subsequence
        // of string2. A subsequence means all the characters
        // of string1 must appear in string2 in order,
        // but not necessarily next to each other.
        // ----------------------------------------------------

        // s1 -> "a b c"                                 // s1 = " b d f"
        // s2 -> "a d b c e"                             // s2 = " a f b d e"
        // is subsequence = true                         // is subsequence = false


        // pegar s1 e salvar
        // pegar s2 e salvar
        // remover todos os elementos de s2 que nao estao em s1
        // comparar se s1 == s1

        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();

        for (char ch : string1.toCharArray() ) {
            s1.add(String.valueOf(ch));

            for (char ch2 : string2.toCharArray() ) {
                if (ch2 == ch) {
                    s2.add(String.valueOf(ch2));
                }
            }
        }

        return s1.equals(s2);
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"abc\", \"ahbgdc\" → " +
                isSubsequence("abc", "ahbgdc"));       // true

        System.out.println("\"axc\", \"ahbgdc\" → " +
                isSubsequence("axc", "ahbgdc"));       // false

        System.out.println("\"\", \"abc\" → " +
                isSubsequence("", "abc"));             // true

        System.out.println("\"abc\", \"\" → " +
                isSubsequence("abc", ""));             // false

        System.out.println("\"ace\", \"abcde\" → " +
                isSubsequence("ace", "abcde"));        // true
    }

}

