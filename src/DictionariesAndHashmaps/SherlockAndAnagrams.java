package DictionariesAndHashmaps;

import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {

        String s = "kkkk";
        System.out.println("No of pairs of substrings that are anagrams: " + sherlockAndAnagrams(s));

    }

    public static int sherlockAndAnagrams(String s) {
        // Use Hashmap to count every Substring frequency
        // Then for each substring search for pair
        int noOfPairs = 0;
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        // Get all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // Sort alphabetically
                char[] c = s.substring(i, j+1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);

                if (hashMap.containsKey(k)) {
                    hashMap.put(k, hashMap.get(k)+1);
                } else {
                    hashMap.put(k, 1);
                }
            }
        }

        System.out.println(hashMap);

        // Count pairs
        for (String k : hashMap.keySet()) {
            int v = hashMap.get(k); // Get all string frequencies
            noOfPairs += (v * (v - 1)) / 2; // Combination formula, choose 2 to get no. of pairs out of 'v' items
        }

        return noOfPairs;
    }

}
