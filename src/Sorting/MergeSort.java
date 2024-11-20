package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(10);
        arr1.add(50);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(14);
        arr2.add(99);
        arr2.add(100);

        List<Integer> results = merge(arr1, arr2);
        boolean finished = true;
    }

    private static List<Integer> merge(List<Integer> arr1, List<Integer> arr2) {

        // This is only the first part of merge sort
        List<Integer> results = new ArrayList<>();
        int i = 0, j = 0;

        // While there is still data, keep looping
        while(i < arr1.size() && j < arr2.size()) {
            if (arr2.get(j) > arr1.get(i)) {
                results.add(arr1.get(i));
                i++;
            } else {
                results.add(arr2.get(j));
                j++;
            }
        }

        // When we exhaust one of them, we take everything left in the other array and add it into "results"
        while (i < arr1.size()) {
            results.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            results.add(arr2.get(j));
            j++;
        }
        return results;
    }
}
