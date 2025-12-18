package CodingChallenges.Section13_GainningSkills;

import java.util.*;
public class Exercise57 {

    public static boolean isValid(String input) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char ch : input.toCharArray()) {

            if (map.containsKey(ch)) {


                if (stack.isEmpty()) return false;


                char top = stack.pop();
                if (top != map.get(ch)) return false;

            } else {

                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"()\" → " + isValid("()"));                  // true
        System.out.println("\"()[]{}\" → " + isValid("()[]{}"));          // true
        System.out.println("\"(]\" → " + isValid("(]"));                  // false
        System.out.println("\"([)]\" → " + isValid("([)]"));              // false
        System.out.println("\"{[]}\" → " + isValid("{[]}"));              // true
        System.out.println("\"\" → " + isValid(""));                      // true
        System.out.println("\"(\" → " + isValid("("));                    // false
    }

}

