package CodingChallenges.Section13_GainningSkills;

public class Exercise59  {

    public static int addDigits(int num) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method takes a non-negative integer and
        // repeatedly adds its digits until only one digit remains.
        //
        // Do not use string conversion or arrays.
        // Use math to extract and sum the digits.
        // ------------------------------------------------------------

        if (num < 10)
            return num;

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return addDigits(sum);
    }






    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " + addDigits(38));      // 2
        System.out.println("→ " + addDigits(0));       // 0
        System.out.println("→ " + addDigits(7));       // 7
        System.out.println("→ " + addDigits(12345));   // 6
        System.out.println("→ " + addDigits(9999));    // 9
    }

}

