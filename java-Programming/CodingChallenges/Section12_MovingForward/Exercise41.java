package CodingChallenges.Section12_MovingForward;

public class Exercise41 {

    public static int secondLargest(int[] numbers) {
        // -------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // second-largest number.
        //
        // The array will contain at least two numbers.
        // -------------------------------------------

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > largest) {
                second_largest = largest;
                largest = n;
            }
            else if (n > second_largest && n != largest) {
                second_largest = n;
            }
        }

        return second_largest;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[5, 1, 9, 3, 7] → " + secondLargest(new int[]{5, 1, 9, 3, 7}));
        // 7

        System.out.println("[2, 4] → " + secondLargest(new int[]{2, 4}));
        // 2

        System.out.println("[10, 10, 5, 8] → " + secondLargest(new int[]{10, 10, 5, 8}));
        // 8

        System.out.println("[100, 99, 50, 1] → " + secondLargest(new int[]{100, 99, 50, 1}));
        // 99

        System.out.println("[-5, -1, -3] → " + secondLargest(new int[]{-5, -1, -3}));
        // -3

    }

}

