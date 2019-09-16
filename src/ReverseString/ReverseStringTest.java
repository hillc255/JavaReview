package ReverseString;

import org.junit.Assert;

public class ReverseStringTest {

   // Write a function that takes a string as input and returns the string reversed.
   // Example1: input: "Hello World!", return "!dlroW olleH"
   // Example2: input: “abcde”, return “edcba”
   // Example2: input: “abcde”, return “edcba”


    @org.junit.Test
    public void reverseStringTest1(){
        String input = "Hello World!";
        String output = "!dlroW olleH";
     Assert.assertEquals("Output is reverse",output, ReverseString.reverseString(input)) ;
    }

    @org.junit.Test
    public void reverseStringTest2(){
        String input = "abcde";
        String output = "edcba";
        Assert.assertEquals("Output is reverse",output, ReverseString.reverseString(input)) ;
    }

    @org.junit.Test
    public void reverseStringTest3() {
        Assert.assertEquals(ReverseStringDemo.reverseStringDemo("Hello World!"), "!dlroW olleH");
    }


}
