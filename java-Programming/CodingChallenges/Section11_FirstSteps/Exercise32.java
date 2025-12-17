package CodingChallenges.Section11_FirstSteps;

public class Exercise32  {

    public static String repeatWord(String word, int count) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string and a non-negative integer,
        // return the string repeated that many times.
        //
        // If count is 0 or the string is empty,
        // return an empty string.
        // ----------------------------------------

        String r = "";

        if (!word.isEmpty() || count > 0) {
            for (int i = 0; i < count; i++) {
                r += word;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"hi\" * 3 → " + repeatWord("hi", 3));       // hihihi
        System.out.println("\"abc\" * 2 → " + repeatWord("abc", 2));     // abcabc
        System.out.println("\"hello\" * 0 → " + repeatWord("hello", 0)); // (empty)
        System.out.println("\"a\" * 5 → " + repeatWord("a", 5));         // aaaaa
        System.out.println("\"\" * 4 → " + repeatWord("", 4));           // (empty)

    }

}

