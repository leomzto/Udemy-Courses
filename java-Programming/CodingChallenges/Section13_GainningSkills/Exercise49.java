package CodingChallenges.Section13_GainningSkills;

import java.util.Stack;

public class Exercise49 {

    public static String removeAdjacentDuplicates(String input) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, remove all adjacent
        // duplicate characters in pairs.
        //
        // Use a stack to solve the problem.
        // Return the final string.
        // ----------------------------------------

        Stack<Character> stack = new Stack<>();

        //List<Character> letters = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
                continue;
            }
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        //System.out.println(stack);

        return sb.toString();
    }


        public static void main (String[]args){

            // Do not change the code in the main method

            System.out.println("\"abbaca\" → " +
                    removeAdjacentDuplicates("abbaca"));     // ca

            System.out.println("\"azxxzy\" → " +
                    removeAdjacentDuplicates("azxxzy"));     // ay

            System.out.println("\"aabcca\" → " +
                    removeAdjacentDuplicates("aabcca"));     // ba

            System.out.println("\"abcddcba\" → " +
                    removeAdjacentDuplicates("abcddcba"));   // (empty)

            System.out.println("\"\" → " +
                    removeAdjacentDuplicates(""));           // (empty)
        }

    }


