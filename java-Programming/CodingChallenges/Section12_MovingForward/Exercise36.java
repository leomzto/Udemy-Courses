package CodingChallenges.Section12_MovingForward;

public class Exercise36 {

    public static boolean isVowel(String letter) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a single-character string, return
        // true if it is a lowercase vowel.
        //
        // Vowels: a, e, i, o, u
        // Return false for uppercase or other letters.
        // ----------------------------------------

        if (letter.length() != 1) return false;

        String vowels = "aeiou";
        return vowels.contains(letter);
    }



    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"a\" → " + isVowel("a"));   // true
        System.out.println("\"e\" → " + isVowel("e"));   // true
        System.out.println("\"b\" → " + isVowel("b"));   // false
        System.out.println("\"A\" → " + isVowel("A"));   // false
        System.out.println("\"u\" → " + isVowel("u"));   // true

    }

}

