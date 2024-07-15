package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static void runAlgorithm() {
        String a = "cde";
        String b = "abc";

        System.out.println("No of deletions: " + makeAnagram(a, b));
    }

    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> characterFrequencyOfA = new HashMap<>();
        Map<Character, Integer> characterFrequencyOfB = new HashMap<>();

        // Count frequencies for string a
        for (char ch : a.toCharArray()) {
            characterFrequencyOfA.put(ch, characterFrequencyOfA.getOrDefault(ch, 0) + 1);
        }

        // Count frequencies for string b
        for (char ch : b.toCharArray()) {
            characterFrequencyOfB.put(ch, characterFrequencyOfB.getOrDefault(ch, 0) + 1);
        }

        int deletions = 0;

        // Calculate deletions for characters in characterFrequencyOfA
        for (Map.Entry<Character, Integer> entry : characterFrequencyOfA.entrySet()) {
            char ch = entry.getKey();
            int countInA = entry.getValue();
            int countInB = characterFrequencyOfB.getOrDefault(ch, 0);
            deletions += Math.abs(countInA - countInB);
            characterFrequencyOfB.remove(ch); // Remove the character from characterFrequencyOfB to avoid recounting
        }

        // Calculate deletions for characters left in characterFrequencyOfB
        for (int countInB : characterFrequencyOfB.values()) {
            deletions += countInB;
        }

        return deletions;
    }

}
