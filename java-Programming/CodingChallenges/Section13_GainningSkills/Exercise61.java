package CodingChallenges.Section13_GainningSkills;

public class Exercise61 {

    public static String longestCommonPrefix(String[] strs) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method finds the longest common prefix string
        // among an array of strings.
        // If no common prefix exists, return an empty string.
        //
        // ------------------------------------------------------------

        //LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        char[][] matriz = new char[strs.length][];
        int maxIndex = Integer.MAX_VALUE; // to not access invalid indexes

        for (int i = 0; i < strs.length; i++) {
            matriz[i] = strs[i].toCharArray();
            maxIndex = Math.min(maxIndex, matriz[i].length);
        }
        
        /*
        for (char[] chars : matriz) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        */
        
        StringBuilder sb = new StringBuilder();

        for (int line = 0; line < maxIndex; line++) {
            char c = matriz[0][line];

            boolean match = true;
            for (int coloumn = 1; coloumn < matriz.length; coloumn++) {
                if (matriz[coloumn][line] != c) {
                    match = false;
                    break;
                }
            }

            if (match) sb.append(c);
            else break;
        }


        //System.out.println(Arrays.toString(strs));

        //System.out.println("map: " + map);

        return sb.toString();
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        // fl

        System.out.println("→ " +
                longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        // ""

        System.out.println("→ " +
                longestCommonPrefix(new String[]{"interspecies", "interstellar", "interstate"}));
        // inters

        System.out.println("→ " +
                longestCommonPrefix(new String[]{"a"}));
        // a

        System.out.println("→ " +
                longestCommonPrefix(new String[]{"", "b"}));
        // ""
    }

}

