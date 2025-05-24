package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {

        // Convert a Roman numeral to an integer value

        // Create a Hashmap to hold Roman numeral integer values

        // Iterate through roman numeral characters in pairs
        // If combination of first and second character corresponds to a special roman number
        // Get it's value from hash map
        // Else
        // Get value of first letter

        int romanNumeralValue = 0;
        Map<String, Integer> romanNumeralValues = new HashMap<>();

        romanNumeralValues.put("I", 1);
        romanNumeralValues.put("V", 5);
        romanNumeralValues.put("X", 10);
        romanNumeralValues.put("L", 50);
        romanNumeralValues.put("C", 100);
        romanNumeralValues.put("D", 500);
        romanNumeralValues.put("M", 1000);

        // Special cases
        romanNumeralValues.put("IV", 4);
        romanNumeralValues.put("IX", 9);
        romanNumeralValues.put("XL", 40);
        romanNumeralValues.put("XC", 90);
        romanNumeralValues.put("CD", 400);
        romanNumeralValues.put("CM", 900);

        for (int i = 0; i < s.length(); i++) {

            char firstLetter = s.charAt(i);

            if (i == s.length() - 1) {
                romanNumeralValue += romanNumeralValues.get(String.valueOf(firstLetter));
            } else {
                char secondLetter = s.charAt(i+1);
                String combo = String.valueOf(firstLetter) + String.valueOf(secondLetter);

                if (romanNumeralValues.containsKey(combo)) {
                    romanNumeralValue += romanNumeralValues.get(combo);
                    i++;
                }
                else {
                    romanNumeralValue += romanNumeralValues.get(String.valueOf(firstLetter));
                }
            }

        }

        return romanNumeralValue;

    }
}
