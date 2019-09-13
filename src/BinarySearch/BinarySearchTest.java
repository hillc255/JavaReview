package BinarySearch;

import org.junit.Assert;

public class BinarySearchTest {
    //solution: https://github.com/udacity/JDND/tree/master/exercises/c1/exercises

    @org.junit.Test
    public void BinarySearchTest1() throws Exception{
        //given
        int[] arr = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        //when
        int target = 11;
        //then
        int output = arr[5];
        Assert.assertEquals(output, target);
    }
    @org.junit.Test
    public void BinarySearchTest2() throws Exception{
        //given
        int[] arr = {1, 2, 3, 4, 5};
        //when
        int target = 10;
        //then
        int output = -1;
        Assert.assertEquals("No match", -1, output);
    }
    @org.junit.Test
    public void BinarySearchTest3() throws Exception{
        //given
        int[] arr = {8};
        //when
        int target = 8;
        //then
        int output = arr[0];
        Assert.assertEquals(target, output);
    }
    @org.junit.Test
    public void BinarySearchTest4() throws Exception{
        //given
        int[] arr = {};
        //when
        int target = 2;
        //then
        int output = -1;
        Assert.assertEquals("No match", -1, output);
    }

}
