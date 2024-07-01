package DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static String twoStringsOptimized(String s1, String s2) {

        // Use a HashSet to store characters from the first string
        Set<Character> charactersInS1 = new HashSet<>();

        // Add each character of s1 to the HashSet
        for (Character c : s1.toCharArray()) {
            charactersInS1.add(c);
        }

        // Check if any character in s2 is in the HashSet
        for (Character c : s2.toCharArray()) {
            if (charactersInS1.contains(c)) {
                return "YES";
            }
        }

        return "NO";

    }

}
