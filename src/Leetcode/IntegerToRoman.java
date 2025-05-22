package Leetcode;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Time Complexity: O(1) - Due to the constant size of the roman numerals!
        // Space Complexity: O(1) - Again because the space is bounded

        // Just hardcode the values for the special cases of 4 and 9
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; ++i) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
