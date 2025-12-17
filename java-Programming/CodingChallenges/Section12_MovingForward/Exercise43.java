package CodingChallenges.Section12_MovingForward;

public class Exercise43 {

    public static Integer firstRepeatingNumber(int[] nums) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // first number that appears more than once.
        //
        // Return null if no number repeats.
        // ----------------------------------------

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return nums[i];
            }
        }
        return null;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[2, 5, 1, 2, 3] → " +
                firstRepeatingNumber(new int[]{2, 5, 1, 2, 3}));

        System.out.println("[1, 2, 3, 4, 5] → " +
                firstRepeatingNumber(new int[]{1, 2, 3, 4, 5}));

        System.out.println("[7, 8, 9, 7, 8] → " +
                firstRepeatingNumber(new int[]{7, 8, 9, 7, 8}));

        System.out.println("[4, 4, 5, 6] → " +
                firstRepeatingNumber(new int[]{4, 4, 5, 6}));

        System.out.println("[] → " +
                firstRepeatingNumber(new int[]{}));

        System.out.println("[-1, -2, -3, -1] → " +
                firstRepeatingNumber(new int[]{-1, -2, -3, -1}));

    }

}
