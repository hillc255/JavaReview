package Calculate;

import org.junit.Assert;

public class CalculateTest {

    @org.junit.Test
    public void calculateTest1() throws Exception {
        //given
        String e = "1+2";
        //when calculation is performed
        //then you get expected result
        int expect = 3;
        Assert.assertEquals(expect, Calculate.calculate(e));
    }

    @org.junit.Test
    public void calculateTest2() throws Exception {
        //given
        String e = "1+2*5";
        //when calculation is performed
        //then you get expected result
        int expect = 11;
        Assert.assertEquals(expect, Calculate.calculate(e));
    }


    @org.junit.Test
    public void calculateTest3() throws Exception {
        Assert.assertEquals(Calculate.calculate("1+2"), 3);
    }

    @org.junit.Test
    public void calculateTest4() throws Exception {
        Assert.assertEquals(Calculate.calculate("1+2*5"), 11);
    }
}
