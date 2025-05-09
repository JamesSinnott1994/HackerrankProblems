package Leetcode;

public class closestToZero {

    public static void main(String[] args) {
        /*
        Given an array of integers ranging from -MAX_INT to MAX_INT, return the integer that is closest to zero
        If you have -5 and 6, return the positive integer

        Write a unit test for this
         */
        System.out.println(closestToZero.closestToZeroTest(new int[]{-5, 6, 2319, 54, -2}));
    }

    public static int closestToZeroTest(int[] numbers) {

        // Get closest positive number
        // Get closest negative number
        int closest = 0;
        int closestPositive = Integer.MAX_VALUE;
        int closestNegative = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < 0 && number > closestNegative) {
                closestNegative = number;
            } else if (number > 0 && number < closestPositive) {
                closestPositive = number;
            } else {
                closestNegative = number;
                closestPositive = number;
            }
        }

        if (Math.abs(closestNegative) == Math.abs(closestPositive)) {
            closest = closestPositive;
        } else if (Math.abs(closestNegative) < Math.abs(closestPositive)) {
            closest = closestNegative;
        } else if (Math.abs(closestNegative) > Math.abs(closestPositive)) {
            closest = closestPositive;
        }

        return closest;
    }

    public static int closestToZeroTest2(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return 0; // or throw an exception
        }

        int closest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            if (Math.abs(current) < Math.abs(closest) ||
                    (Math.abs(current) == Math.abs(closest) && current > closest)) {
                closest = current;
            }
        }

        return closest;
    }

}
