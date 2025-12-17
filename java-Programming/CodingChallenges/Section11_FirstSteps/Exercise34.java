package CodingChallenges.Section11_FirstSteps;

public class Exercise34 {

    public static int sumDigits(String text) {
        // --------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method takes a string of digits and returns
        // the sum of all digits in the string.
        //
        // It uses Character.getNumericValue() to convert
        // characters to integers and adds them together.
        // --------------------------------------------------

        int sum = 0;

        for (char c : text.toCharArray()) {
            int num = Character.getNumericValue(c);

            sum += num;
        }

        return sum;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"12345\" → " + sumDigits("12345"));   // 15
        System.out.println("\"5\" → " + sumDigits("5"));           // 5
        System.out.println("\"000\" → " + sumDigits("000"));       // 0
        System.out.println("\"\" → " + sumDigits(""));             // 0
        System.out.println("\"908172\" → " + sumDigits("908172")); // 27
    }

}

