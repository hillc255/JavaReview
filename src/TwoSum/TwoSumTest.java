package TwoSum;

import org.junit.Assert;

public class TwoSumTest {

    // Given an integer array, return true if two numbers in this array
    // can be summed to target.
   // Example1: input[1, 2, 3, 4], target:5, return true
   // Example2: input[1,4,5,1,6], target 12, return false

    @org.junit.Test
    public void twoSumTrue(){
        int[] nums= new int[]{1, 2, 3, 4};
        int target = 5;
        boolean out = true;
        Assert.assertEquals(out, TwoSum.twoSum(nums, target));
    }

    @org.junit.Test
    public void twoSumFalse(){
        int[] nums = new int[]{1,4,5,1,6};
        int target = 12;
        boolean out = false;
        Assert.assertEquals(out, TwoSum.twoSum(nums, target));
    }

    @org.junit.Test
    public void twoSumTrue2(){
        int[] nums= new int[]{1, 2, 3, 4, 20};
        int target = 23;
        boolean out = true;
        Assert.assertEquals(out, TwoSum.twoSum(nums, target));
    }

    @org.junit.Test
    public void twoSumTrueTwo(){
        int[] nums= new int[]{1, 2, 3, 4};
        int target = 5;
        boolean out = true;
        Assert.assertEquals(out, TwoSumDemo.twoSum(nums, target));
    }

    @org.junit.Test
    public void twoSumFalseThree(){
        int[] nums = new int[]{1,4,5,1,6};
        int target = 12;
        boolean out = false;
        Assert.assertEquals(out, TwoSumDemo.twoSum(nums, target));
    }

}
