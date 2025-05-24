package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

    /*
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
    of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
    extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.
     */

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Time Complexity: O(N)
        // Space Complexity: O(N)

        int maxCandy = Arrays.stream(candies).max().getAsInt();
        List<Boolean> kidsWithGreatestCandies = new ArrayList<>();

        for (int candyValue : candies) {
            if (candyValue + extraCandies >= maxCandy) {
                kidsWithGreatestCandies.add(true);
            } else {
                kidsWithGreatestCandies.add(false);
            }
        }
        return kidsWithGreatestCandies;
    }
}
