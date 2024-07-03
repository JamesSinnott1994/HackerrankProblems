package Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void runFunction() {

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        countSwaps(a);

    }

    public static void countSwaps(List<Integer> a) {

        /*
        Runtime complexity is Quadratic complexity -> O(n^2)
         */
        int numSwaps = 0;

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j+1)) {
                    int higherValue = a.get(j);
                    int lowerValue = a.get(j+1);
                    a.set(j, lowerValue);
                    a.set(j+1, higherValue);
                    numSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));
    }

}
