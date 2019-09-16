package TopK;

import org.junit.Assert;

import java.util.Arrays;

public class TopKTest {

//    Complete the “find top k larger number” in an unsorted integer array.
//    Given an unsorted integer array, return the top k larger number in a sorted list.
//    The k is always less than array size.
//    Make sure the time complexity is less than O(nlogn).
//
//    Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}
//    Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}

    @org.junit.Test
    public void TopKTest1(){
        int[] numArray = {-1, 15, 59, 22, 6, 42, 45, 0};
        int k = 4;
        int[] result = {22, 42, 45, 59};
        int[] expectedResult = TopK.topk(numArray, k);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void TopKTest2(){
        int[] numArray = {5, 10, 22, 100, 8};
        int k = 2;
        int[] result = {22, 100};
        int[] expectedResult = TopK.topk(numArray, k);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @org.junit.Test
    public void TopKTest3(){
        Assert.assertEquals(TopKDemo.topKLarger(new int[] {5, 10, 15, 100, 8}, 2),
                Arrays.asList(15, 100));
    }
}
