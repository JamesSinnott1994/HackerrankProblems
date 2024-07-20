package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AbsoluteMinimumDifference {

    public static void runAbsoluteMinimumDifference() {

        List<Integer> arr = new ArrayList<>();
        arr.add(-2);
        arr.add(2);
        arr.add(4);

        System.out.println(minimumAbsoluteDifference(arr));

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {

        /*
        Time complexity: Quadratic complexity of O(n^2)
         */

        // Iterate through all numbers
        // Iterate through every pair of numbers
        // Get the absolute difference between the current number and all other numbers
        // Keep track of minimum number
        // If minimum number is 0, then break out of loop

        int minimumNumber = -1;
        for (int i = 0; i < arr.size(); i++) {

            for (int j = i+1; j < arr.size(); j++) {

                int absoluteDifference = Math.abs(arr.get(i) - arr.get(j));

                if (i == 0) {
                    minimumNumber = absoluteDifference;
                }

                if (absoluteDifference < minimumNumber) {
                    minimumNumber = absoluteDifference;
                }

                // Can't get a positive number lower than zero
                if (minimumNumber == 0) {
                    break;
                }

            }

        }

        return minimumNumber;

    }

    public static int optimizedMinimumAbsoluteDifference(List<Integer> arr) {

        /*
        Time complexity: Logarithmic complexity, O(n log n)
         */

        // Sort so then we will only have to compare the values that are closest to each other
        // which is where the smallest differences are
        // i.e. don't need to compare different combinations of pairs
        Collections.sort(arr);
        int minDiff = Math.abs(arr.get(0) - arr.get(1)); // Gets the initial value

        for (int i = 2; i < arr.size(); i++) {

            // Go through each pair
            if (Math.abs(arr.get(i-1) - arr.get(i)) < minDiff) {
                minDiff = Math.abs(arr.get(i-1)-arr.get(i));
            }

        }

        return minDiff;

    }

}
