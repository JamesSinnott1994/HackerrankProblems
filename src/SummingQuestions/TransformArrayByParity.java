package SummingQuestions;

import java.util.Arrays;

public class TransformArrayByParity {
    public static int[] transformArray(int[] nums) {
        int zeroCount = 0;

        // First pass: transform and count 0s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
                zeroCount++;
            } else {
                nums[i] = 1;
            }
        }

        // Second pass: overwrite with sorted values
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i < zeroCount) ? 0 : 1;
        }

        return nums;
    }
}
