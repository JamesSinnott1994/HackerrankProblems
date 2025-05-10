package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 1, 5, 7, 6, 3, 9};
        int[] returnedArray = quickSort(arr, 0, arr.length-1);
        System.out.println(returnedArray);
    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if(left < right){
            int pivotIndex = pivot(arr, left, right); //3
            //left
            quickSort(arr,left,pivotIndex-1);
            //right
            quickSort(arr,pivotIndex+1,right);
        }
        return arr;
    }

    private static int pivot(int[] arr, int start, int end) {

        /*
        Gets the Pivot Index
         */

        int pivot = arr[start];
        int swapIdx = start;

        for(int i = start + 1; i < arr.length; i++){
            if(pivot > arr[i]){
                swapIdx++;
                swap(arr,swapIdx,i);
            }
        }
        swap(arr,start,swapIdx);
        return swapIdx;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
