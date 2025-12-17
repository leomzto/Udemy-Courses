package CodingChallenges.Section11_FirstSteps;

public class Exercise33  {

    public static int countA(String text) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, return the number of
        // lowercase 'a' characters found in it.
        //
        // Only lowercase 'a' counts.
        // Do not count uppercase 'A'.
        // ----------------------------------------

        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == 'a') count++;
        }

        return count;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("'apple and banana' → " + countA("apple and banana"));  // 5
        System.out.println("'aardvark' → " + countA("aardvark"));                  // 3
        System.out.println("'hello world' → " + countA("hello world"));            // 0
        System.out.println("Empty string → " + countA(""));                        // 0
        System.out.println("'aAaAaA' → " + countA("aAaAaA"));                      // 3

    }

}

