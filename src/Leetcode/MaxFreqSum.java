package Leetcode;

import java.util.HashMap;

public class MaxFreqSum {

    public static int maxFreqSum(String s) {
        // Iterate through string
        // If letter is vowel, add to vowelDictionary and increment occurence
            // Calculate max value of vowel
        // If letter is consonant, add to consonantDictionary and increment occurence
        // Calculate max value of consonant

        int maxVowel = 0;
        int maxConsonant = 0;
        HashMap<Character, Integer> vowelDictionary = new HashMap<>();
        HashMap<Character, Integer> consonantDictionary = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'a' || letter == 'o' || letter == 'i' || letter == 'e' || letter == 'u') {
                vowelDictionary.put(letter, vowelDictionary.getOrDefault(letter, 0) + 1);
                maxVowel = Math.max(maxVowel, vowelDictionary.get(letter));
            } else {
                consonantDictionary.put(letter, consonantDictionary.getOrDefault(letter, 0) + 1);
                maxConsonant = Math.max(maxConsonant, consonantDictionary.get(letter));
            }
        }

        return maxVowel + maxConsonant;
    }
}
