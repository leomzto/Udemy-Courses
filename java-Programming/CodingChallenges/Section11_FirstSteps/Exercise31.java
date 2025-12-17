package CodingChallenges.Section11_FirstSteps;

public class Exercise31 {

    public static int sumArray(int[] numbers) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // total sum of all the numbers in the array.
        //
        // If the array is empty, return 0.
        // ----------------------------------------
        int sum = 0;

        if (numbers.length == 0) return 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println(sumArray(new int[]{1, 2, 3}));          // 6
        System.out.println(sumArray(new int[]{10, -5, 5}));        // 10
        System.out.println(sumArray(new int[]{}));                 // 0
        System.out.println(sumArray(new int[]{100}));              // 100
        System.out.println(sumArray(new int[]{0, 0, 0}));          // 0

    }

}

