package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        // Merge Arrays Implementation
//        List<Integer> arr1 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add(10);
//        arr1.add(50);
//
//        List<Integer> arr2 = new ArrayList<>();
//        arr2.add(2);
//        arr2.add(14);
//        arr2.add(99);
//        arr2.add(100);
//
//        List<Integer> results = merge(arr1, arr2);
//        boolean finished = true;

        // Merge Sort Implementation
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(24);
        arr.add(76);
        arr.add(73);

        List<Integer> sortedList = mergeSort(arr);
        int i = 0;
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

    private static List<Integer> mergeSort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int mid = arr.size() / 2;
        List<Integer> left = mergeSort( new ArrayList<>(arr.subList(0, mid)) );
        List<Integer> right = mergeSort( new ArrayList<>(arr.subList(mid, arr.size())) );
        return merge(left, right);
    }
}