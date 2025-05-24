package Leetcode;

public class ReverseDegreeOfAString {

    /*
    Given a string s, calculate its reverse degree.

    The reverse degree is calculated as follows:

        - For each character, multiply its position in the reversed alphabet
        ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
        - Sum these products for all characters in the string.
        - Return the reverse degree of s.
     */

    public static int reverseDegree(String s) {
        int reverseDegree = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //'z' takes ascii value --> 'z'=122, c='a'=96 --> a=(122-96)+1=26
            int indexInReversedAlpabet = ('z' - c) + 1;
            int product = indexInReversedAlpabet * (i+1);
            reverseDegree += product;
        }
        return reverseDegree;
    }
}
