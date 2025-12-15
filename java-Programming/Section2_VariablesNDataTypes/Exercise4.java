package Section2_VariablesNDataTypes;

public class Exercise4 {

    public static void main(String[] args) {

        // byte: Smallest integer type. Range: -128 to 127.
        byte myByte = 127;
        System.out.println("Byte example: " + myByte);

        // short: Larger than byte, smaller than int. Range: -32,768 to 32,767.
        short myShort = 32000;
        System.out.println("Short example: " + myShort);

        // int: Default integer type. Range: -2,147,483,648 to 2,147,483,647.
        int myInt = 2147000000;
        System.out.println("Int example: " + myInt);

        // long: Larger integer type for wider range. Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        // Suffix 'L' is used to denote a long literal.
        long myLong = 9223372036854775807L;
        System.out.println("Long example: " + myLong);

        // float: Single-precision 32-bit floating point. Use 'f' suffix to denote float literal.
        float myFloat = 3.14159f;
        System.out.println("Float example: " + myFloat);

        // double: Double-precision 64-bit floating point. Default for floating-point numbers.
        double myDouble = 3.141592653589793;
        System.out.println("Double example: " + myDouble);

        // boolean: Holds either true or false.
        boolean myBool = true;
        System.out.println("Boolean example: " + myBool);

        // char: Single 16-bit Unicode character.
        char myChar = 'A';
        System.out.println("Char example: " + myChar);

        // Display the size of each primitive type in bytes
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");

        // Display the maximum and minimum values for each type
        System.out.println("Max byte value: " + Byte.MAX_VALUE);
        System.out.println("Min byte value: " + Byte.MIN_VALUE);
        System.out.println("Max short value: " + Short.MAX_VALUE);
        System.out.println("Min short value: " + Short.MIN_VALUE);
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
        System.out.println("Max long value: " + Long.MAX_VALUE);
        System.out.println("Min long value: " + Long.MIN_VALUE);
        System.out.println("Max float value: " + Float.MAX_VALUE);
        System.out.println("Min float value: " + Float.MIN_VALUE);
        System.out.println("Max double value: " + Double.MAX_VALUE);
        System.out.println("Min double value: " + Double.MIN_VALUE);
        System.out.println("Max char value: " + (int)Character.MAX_VALUE);
        System.out.println("Min char value: " + (int)Character.MIN_VALUE);

    }

}

