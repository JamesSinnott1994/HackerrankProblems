package DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

    public static void runFunction() {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));

    }

    public static String twoStrings(String s1, String s2) {

        /*
        MY SOLUTION

        Runtime complexity (Big O Notation) of Linear complexity -> O(N)
         */

        // Return "YES" or "NO" if there is a common substring in each pair

        // For loop to go through each string character by character
        // Add character to separate dictionary/hashmap for each string

        // Iterate through keys of dictionary/hashmap
        // Check if second dictionary contains key
        // If so, return "YES"


        Map<Character, Integer> d1 = new HashMap<Character, Integer>();
        Map<Character, Integer> d2 = new HashMap<Character, Integer>();

        for (Character c : s1.toCharArray()) {
            d1.put(c, 0);
        }
        for (Character c : s2.toCharArray()) {
            d2.put(c, 0);
        }


        // Check for substring
        for (Map.Entry<Character, Integer> entry : d1.entrySet()) {
            if (d2.containsKey(entry.getKey())) {
                return "YES";
            }
        }

        return "NO";

    }

}
