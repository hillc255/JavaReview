package NumToWord;

import org.junit.Assert;

public class NumToWordTest {

//   Complete the “translate number to word” coding exercise.
//    Given a non-negative integer n, print the number in words.
//            Example1:
//    Input: 10245
//    Output: "ten thousand two hundred forty five"
//
//    Example2:
//    Input: 125
//    Output: "one hundred twenty five"

    @org.junit.Test
    public void numToWordTest1(){

        int input = 10245;
        String output = "ten thousand two hundred forty five";
        Assert.assertEquals(NumToWord.translateNumberToWord(input), output);

    }
    @org.junit.Test
    public void numToWordTest2() {

        int input = 125;
        String output = "one hundred twenty five";
        Assert.assertEquals(NumToWord.translateNumberToWord(input), output);
    }
}
