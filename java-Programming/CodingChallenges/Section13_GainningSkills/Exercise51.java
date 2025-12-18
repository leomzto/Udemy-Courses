package CodingChallenges.Section13_GainningSkills;

public class Exercise51 {


    public static int missingNumber(int[] nums) {
        // ----------------------------------------------------
        // Given an array of integers from 0 to n (missing one),
        // this method finds and returns the missing number.
        // It uses the sum formula to calculate what the sum
        // *should* be and compares it to the actual total.
        // ----------------------------------------------------

        int n = nums.length;
        int formula = n * (n + 1) / 2;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return formula - sum;
    }

    // 3, 0, 1
    // sum -> 4
    // formula: 3 * (3 + 1) / 2 -> 3 * 4 / 2 -> 12 / 2 = 6
    // 6 - 4 = 2 -> formula - sum




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                missingNumber(new int[]{3, 0, 1}));       // 2

        System.out.println("→ " +
                missingNumber(new int[]{0, 1}));          // 2

        System.out.println("→ " +
                missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));  // 8

        System.out.println("→ " +
                missingNumber(new int[]{0}));             // 1

        System.out.println("→ " +
                missingNumber(new int[]{1}));             // 0

    }

}

