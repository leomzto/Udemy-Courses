package Section4_Strings;

public class Exercise10 {

    public static void main(String[] args) {

        // String declaration and initialization
        String myString = "Hello World!";
        System.out.println("Declared and initialized myString: " + myString);

        // Declaring multiple strings
        String myString2 = "hello";
        String myString3 = "3.141592";
        String myString4 = "!@#$%^&*()_=+{}\\|,;<>./?";
        System.out.println("Various strings: " + myString2 + ", " + myString3 + ", " + myString4);

        // String concatenation
        String hello = "Hello";
        hello += " World!";
        System.out.println("Concatenated string: " + hello);

        // Using string concatenation to combine strings and numbers
        int myInt = 5;
        String myIntString = "My Int is: " + myInt;
        System.out.println(myIntString);

        // Concatenation using +=
        String hello2 = "Hello";
        hello2 += " World!";
        System.out.println("Concatenation using +=: " + hello2);

    }

}

