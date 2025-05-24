package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"dogcar", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        // Return the common longest prefix amongst strings

        // Sort the array of strings by length in ascending order
        // If first string is contained in other strings
        // Return first string
        // Else
        // deduct one character from first string
        // Return ""

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        String firstWord = strs[0];

        while (firstWord.length() > 0) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].contains(firstWord) && i == (strs.length - 1)) {
                    return firstWord;
                } else if (strs[i].contains(firstWord)) {
                    continue;
                } else {
                    firstWord = firstWord.substring(0, firstWord.length()-1);
                }
            }
        }
        return "";
    }
}
