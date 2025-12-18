package Section4_Strings;

public class Exercise15 {

    public static void main(String[] args) {

        // Example of using escape sequences in Java strings

        // Escaping double quotes
        String myString = "\"Hello World!\"";
        System.out.println("String with escaped double quotes: " + myString);

        // Using a single quote in a string
        String quoteString = "'Hello'";  // No escape needed for single quotes in strings
        System.out.println("String with single quotes: " + quoteString);

        // Escaping single quote in a char
        char myChar = '\'';
        System.out.println("Character with escaped single quote: " + myChar);

        // Using backslash in a string
        String pathString = "C:\\Program Files\\Java";
        System.out.println("String with escaped backslashes (path): " + pathString);

        // Using newline and tab
        String newLineAndTab = "Line 1\n\tLine 2";
        System.out.println("String with newline and tab:\n" + newLineAndTab);

        // Example of a more complex string with mixed escape sequences
        String complexString = "\"Hello\", she said, \"Your ID is '1234'!\"";
        System.out.println("Complex string with mixed escape sequences: " + complexString);

    }

}

