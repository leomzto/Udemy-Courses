package CodingChallenges.Section12_MovingForward;

public class Exercise42  {

    public static boolean isAscending(int[] numbers) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Return true if the numbers in the array
        // are strictly ascending (no duplicates).
        //
        // An empty array or one element counts
        // as ascending.
        // ----------------------------------------

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) return false;
        }

        return true;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 3, 4, 5] → " + isAscending(new int[]{1, 2, 3, 4, 5}));   // true
        System.out.println("[2, 2, 3] → " + isAscending(new int[]{2, 2, 3}));               // false
        System.out.println("[10, 9, 8] → " + isAscending(new int[]{10, 9, 8}));             // false
        System.out.println("[5] → " + isAscending(new int[]{5}));                           // true
        System.out.println("[] → " + isAscending(new int[]{}));                             // true

    }

}

