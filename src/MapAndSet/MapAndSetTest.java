package MapAndSet;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class MapAndSetTest {

    @org.junit.Test
    public void mapAndSetTest1(){
        //given list of strings
        String[] input = {"abc", "bcd", "abc"};
        //when the frequency of the string is counted
        String output = "abc|2 bcd|1";
        //then the result will match expected output
        Assert.assertEquals(MapAndSet.mapAndSet(input), output);
    }
}
