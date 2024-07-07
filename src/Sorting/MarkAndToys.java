package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {

    public static void runFunction() {

        List<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(12);
        prices.add(5);
        prices.add(111);
        prices.add(200);
        prices.add(1000);
        prices.add(10);
        System.out.println("Max toys that can be bought is: " + maximumToys(prices, 50));

    }

    public static int maximumToys(List<Integer> prices, int k) {

        // Collections.sort() uses the Timsort algorithm which has O(n log n) time complexity

        // Sort the array in ascending order, lowest to highest
        // Iterate through array
        // incrementing total cost
        // increment noOfToysBought
        // If totalCost > amountOfMoney, break out of loop
        // Return noOfToys
        int noOfToys = 0;
        Collections.sort(prices); // Could use BubbleSort algorithm here as well

        int totalCost = 0;
        for (Integer price : prices) {
            totalCost += price;

            if (totalCost > k) {
                break;
            }
            noOfToys++;

        }
        return noOfToys;
    }
}
