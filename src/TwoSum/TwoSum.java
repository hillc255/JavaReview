package TwoSum;

import java.util.Arrays;

public class TwoSum {

    // Given an integer array, return true if two numbers in this array
    // can be summed to target.

    public static boolean twoSum(int[] nums, int target) {

        boolean i = false;
        int sum = 0;

        for (int j = 0; j < nums.length - 1; j++) {
            for (int k = 1; k < nums.length; k++) {
            // adding numbers
            sum = nums[j] + nums[k];

          //  System.out.println("sum of " + nums[j] + " + " + nums[k] + " = " + sum );

                if(sum == target){
                    i = true;
                return i;
            }
        }}

        return i;
    }
}
