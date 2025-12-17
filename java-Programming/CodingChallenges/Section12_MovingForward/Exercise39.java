package CodingChallenges.Section12_MovingForward;

public class Exercise39 {

    public static String replaceSpaces(String text) {
        // -----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, return a new string where
        // every space is replaced with a hyphen.
        //
        // Do not use .replace(). Use a loop instead.
        // ------------------------------------------

        char to_replace = ' ';

        StringBuilder sb = new StringBuilder();

        char[] text_array = text.toCharArray();

        for (char ch : text_array) {
           sb.append(ch == ' ' ? '-' : ch);
        }

        return sb.toString();

    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"hello world\" → " + replaceSpaces("hello world"));
        // "hello-world"

        System.out.println("\"a b c\" → " + replaceSpaces("a b c"));
        // "a-b-c"

        System.out.println("\"no_spaces_here\" → " + replaceSpaces("no_spaces_here"));
        // "no_spaces_here"

        System.out.println("\"  leading and trailing \" → " + replaceSpaces("  leading and trailing "));
        // "--leading-and-trailing-"

        System.out.println("\"\" → " + replaceSpaces(""));
        // ""

    }

}

