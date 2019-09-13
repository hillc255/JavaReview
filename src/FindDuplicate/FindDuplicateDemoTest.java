package FindDuplicate;

import org.junit.Assert;

public class FindDuplicateDemoTest {

    @org.junit.Test
    public void findDuplicateTest1() throws Exception {
        Assert.assertEquals(FindDuplicateDemo.findDuplicate("abcabc"), 3);
    }

    @org.junit.Test
    public void findDuplicateTest2() throws Exception {
        Assert.assertEquals(FindDuplicateDemo.findDuplicate("abcde"), -1);
    }
}
