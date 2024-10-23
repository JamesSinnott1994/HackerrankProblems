package SlidingWindowPattern;

import java.util.HashMap;
import java.util.Map;

public class findLongestSubstring {

    public static void main(String[] args) {

        // Time Complexity of O(n)
        System.out.println("Longest substring is: " + findLongestSubstring("rithmschool"));
    }

    public static int findLongestSubstring(String str) {

        int longest = 0;
        int start = 0;
        Map<Character, Integer> seen = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character letter = str.charAt(i);
            if (seen.containsKey(letter)) {
                start = Math.max(start, seen.get(letter));
            }

            // index - beginning of substring + 1 (to include current in count)
            longest = Math.max(longest, i - start + 1);

            // store the index of the next char so as to not double count
            seen.put(letter, i+1);
        }

        return longest;

    }

}
