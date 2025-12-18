package CodingChallenges.Section13_GainningSkills;

public class Exercise63  {

    public static String longestPalindrome(String s) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method finds the longest palindromic substring in
        // a given string using the expand-around-center approach.
        //
        // The result is the longest contiguous substring that reads
        // the same forward and backward.
        // ------------------------------------------------------------

        if (s == null || s.isEmpty()) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = search(s, i, i);
            int len2 = search(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }


    private static int search(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome found
        return right - left - 1;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                longestPalindrome("babad"));     // bab or aba

        System.out.println("→ " +
                longestPalindrome("cbbd"));      // bb

        System.out.println("→ " +
                longestPalindrome("a"));         // a

        System.out.println("→ " +
                longestPalindrome("ac"));        // a or c

        System.out.println("→ " +
                longestPalindrome("racecar"));   // racecar
    }

}

