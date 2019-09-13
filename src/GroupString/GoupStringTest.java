package GroupString;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GoupStringTest {

    //Verify
    @org.junit.Test
    public void listCodingTest1() throws Exception {

        //given list of strings in array
        List<String> input = Arrays.asList("bcd", "abc", "cde");

        //when strings are sorted
        List<String> expect = Arrays.asList("abc","bcd", "cde");

        //then the strings will be in alphabetical order
        Assert.assertEquals(expect, GroupString.groupString(input));
    }

}
