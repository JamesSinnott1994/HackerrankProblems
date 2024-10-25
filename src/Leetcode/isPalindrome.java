package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isPalindrome {

    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindromeRefactored(x));

    }

    public static boolean isPalindrome(int x) {

        // Return true if number is a palindrome

        // Convert to string
        // Have variable at left and right of string
        // compare numbers
        // while left != right
            // if value of left and right are equal
            // left++
            // right--
            // else
            // return false

        // return true

        String number = Integer.toString(x);

        int left = 0;
        int right = number.length() - 1;

        while (left <= right) {
            if (number.charAt(left) == number.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;

    }

    public static boolean isPalindromeRefactored(int x) {

        // Step 1: Check for negative numbers and numbers ending in 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Step 2: Reverse half of the number
        while (x > reversedHalf) {

            /*
            Extract the last digit of x and build a reversed half by multiplying the
            reversed half by 10 and adding the extracted digit.

            Continue this until the reversed half is greater than or equal to the
            remaining part of x.
             */

            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Step 3: Once you have reversed half of the digits, compare the reversed
        // half with the first half.

        // If x has an odd number of digits, discard the middle digit by dividing the
        // reversed half by 10 before comparison.
        return x == reversedHalf || x == reversedHalf / 10;
    }

}
