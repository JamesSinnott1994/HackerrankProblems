package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        // Pseudocode
            // Variable for count
            // For word in words
            // For char in word
            // Check if char exists in allowed
            // count++ if it does
            // break if it does not
            // Return count

        // Solution 1
            // int count = 0;
            // boolean consistent;

            // for (String word : words) {
            //     consistent = true;
            //     for (char c : word.toCharArray()) {
            //         if (allowed.indexOf(c) == -1) {
            //             consistent = false;
            //             break;
            //         }
            //     }
            //     if (consistent) {
            //         count++;
            //     }
            // }

            // return count;

        // Solution 2, slightly better using a HashSet
        // - String.indexOf(char) is O(n) in the length of the string allowed.
        // So, for each character in every word, it scans through allowed.
        // - HashSet.contains(char) is O(1) on average.
        // Once you build the Set<Character> from allowed, lookups are constant time.
        int count = 0;
        boolean consistent;
        Set<Character> characters = new HashSet<>(); // Slightly faster than using indexOf on allowed
        for (char c : allowed.toCharArray()) {
            characters.add(c);
        }

        for (String word : words) {
            consistent = true;
            for (char c : word.toCharArray()) {
                if (!characters.contains(c)) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }

        return count;
    }
}
