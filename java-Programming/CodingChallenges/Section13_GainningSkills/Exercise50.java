package CodingChallenges.Section13_GainningSkills;

import java.util.Arrays;

public class Exercise50  {

    public static void rotateArray(int[] nums, int k) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Rotates the given array to the right by k steps.
        // The rotation is done in-place using reversal.
        //
        // Use the helper method below (reverse) in this method.
        // ----------------------------------------

        int len = nums.length;
        if (len == 0) return;

       // System.out.println(len);

        k %= len;
        if (k == 0) return;


        int rightStart = len - k;
        int leftStart = 0;
        int end = len - 1;

        reverse(nums, rightStart, end); // last kth elements
        reverse(nums, leftStart, rightStart - 1); // firs kth - 1 elements
        reverse(nums, leftStart, end); // all the array, to adjust
    }


    // ----------------------------------------
    // Helper method to reverse part of array
    // from start to end index (inclusive)
    // ----------------------------------------
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; // { 1, 2, 2, 7, 5, 6, 4}
        rotateArray(arr1, 3);
        System.out.println("→ " + Arrays.toString(arr1));

        int[] arr2 = {1, 2};
        rotateArray(arr2, 5);
        System.out.println("→ " + Arrays.toString(arr2));  // [2, 1]

        int[] arr3 = {10, 20, 30};
        rotateArray(arr3, 0);
        System.out.println("→ " + Arrays.toString(arr3));  // [10, 20, 30]

        int[] arr4 = {4, 3, 2, 1};
        rotateArray(arr4, 4);
        System.out.println("→ " + Arrays.toString(arr4));  // [4, 3, 2, 1]

        int[] arr5 = {};
        rotateArray(arr5, 1);
        System.out.println("→ " + Arrays.toString(arr5));  // []

    }

}

