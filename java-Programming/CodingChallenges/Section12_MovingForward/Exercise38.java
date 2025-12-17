package CodingChallenges.Section12_MovingForward;

public class Exercise38 {

    public static String removeVowels(String text) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, return a new string with
        // all lowercase vowels (a, e, i, o, u)
        // removed.
        //
        // Uppercase vowels should remain.
        // ----------------------------------------

        String vowels = "aeiou";
        //StringBuilder result = new StringBuilder();
        String result = "";

        char[] textArray = text.toCharArray();

        for (char c : textArray) {
            //if (!vowels.contains(String.valueOf(c))) result.append(c);
            if (!vowels.contains(String.valueOf(c))) result += String.valueOf(c);
        }

        //return result.toString();
        return result;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"hello\" → " + removeVowels("hello"));       // "hll"
        System.out.println("\"apple pie\" → " + removeVowels("apple pie"));// "ppl p"
        System.out.println("\"HELLO\" → " + removeVowels("HELLO"));       // "HELLO"
        System.out.println("\"aeiou\" → " + removeVowels("aeiou"));       // ""
        System.out.println("\"\" → " + removeVowels(""));                 // ""

    }

}

