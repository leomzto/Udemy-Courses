package CodingChallenges.Section13_GainningSkills;

import java.util.*;

public class Exercise53 {

    public static int firstUniqueChar(String text) {
        // -----------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method finds the index of the first character in a
        // string that does not repeat. It uses a HashMap to count
        // character frequencies.
        //
        // Returns -1 if no unique character exists.
        // -----------------------------------------------------------

        // pegar texto e salvar um array de char
        // percorrer array de char e adicionar em um map: char : apariçoes
        // percorrer o array novamente ate encontrar o index cuja text[i] == first
        // retornar i se encontrar
        // retornar -1 se nao houver

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = text.toCharArray();

        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //System.out.println(map);

        Character first = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                first = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < text.length(); i++) {
            if (first != null && first == text.charAt(i)) {
                return i;
            }
        }

        return -1;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                firstUniqueChar("leetcode"));        // 0

        System.out.println("→ " +
                firstUniqueChar("loveleetcode"));    // 2

        System.out.println("→ " +
                firstUniqueChar("aabb"));            // -1

        System.out.println("→ " +
                firstUniqueChar("abcabcde"));        // 6

        System.out.println("→ " +
                firstUniqueChar(""));                // -1
    }

}

