package CodingChallenges.Section12_MovingForward;

public class Exercise37 {

    public static String reverseString(String text) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, return a new string that
        // is the reverse of the input.
        //
        // For example, "apple" becomes "elppa".
        // ----------------------------------------

        char[] textArray = text.toCharArray();

        String reverse = "";

        for (int i = textArray.length - 1; i >= 0; i--) {
            reverse += textArray[i];
        }

        return reverse;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"hello\" → " + reverseString("hello"));     // "olleh"
        System.out.println("\"apple\" → " + reverseString("apple"));     // "elppa"
        System.out.println("\"\" → " + reverseString(""));               // ""
        System.out.println("\"a\" → " + reverseString("a"));             // "a"
        System.out.println("\"12345\" → " + reverseString("12345"));     // "54321"

    }

}

