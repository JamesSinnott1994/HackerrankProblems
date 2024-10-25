package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isPalindrome {

    public static void main(String[] args) {

        int x = 11344311;
        System.out.println(isPalindrome(x));

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

}
