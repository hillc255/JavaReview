package VowelOnly;

import VowelOnly.VowelOnly;
import org.junit.Assert;

public class VowelOnlyTest {

        @org.junit.Test
        public void vowelOnlyTest() throws Exception{
            String input = "Hello World";
            String output = VowelOnly.vowelOnly(input);
            String expected = "eoo";
            Assert.assertEquals(expected, output);
        }
        @org.junit.Test
        public void vowelOnlyTest2() throws Exception{
            String input = "Udacity Course";
            String output = VowelOnly.vowelOnly(input);
            String expected = "Uaioue";
            Assert.assertEquals(expected, output);
        }
}
