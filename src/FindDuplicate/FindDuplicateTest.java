package FindDuplicate;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

import static FindDuplicate.FindDuplicate.findDuplicate;

public class FindDuplicateTest {

    // given a string return the index of the first duplicated character
    // or -1 if there are no duplicated characters.

    @org.junit.Test
    public void testFindFirstDuplicateCharacter() throws IOException {
        //given
        String input = "abcabc";
        //when string is processed
        //then it returns
        int output = 3;
        Assert.assertEquals(output, findDuplicate(input));

    }

    @org.junit.Test
    public void testNoDuplicateCharFound() throws IOException {
        //given
        String input = "abcdef";
        //when string is processed
        //then no duplicates are found
        int output = -1;
        Assert.assertEquals(output, findDuplicate(input));
    }

    @org.junit.Test
    public void testFindFirstDuplicateCharacterLong() throws IOException {
        //given
        String input = "axcdefghijkzymncl";
        //when string is processed
        //then it returns
        int output = 15;
        Assert.assertEquals(output, findDuplicate(input));

    }
}
