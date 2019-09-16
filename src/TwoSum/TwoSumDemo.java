package TwoSum;

import java.util.HashSet;
import java.util.Set;

public class TwoSumDemo {

    //solution:  https://github.com/udacity/JDND/blob/master/exercises/c1/exercises

        public static boolean twoSum(int[] nums, int target) {
            Set<Integer> twoSumSet = new HashSet<>();
            for (int num : nums) {
                if (twoSumSet.contains(num)) {
                    return true;
                }
                twoSumSet.add(target - num);
            }
            return false;
        }
}
