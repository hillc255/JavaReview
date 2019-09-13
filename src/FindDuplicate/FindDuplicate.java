package FindDuplicate;


import java.io.IOException;
import java.io.StringReader;
import java.nio.Buffer;
import java.util.Arrays;

public class FindDuplicate {

    // given a string return the index of the first duplicated character
    // or -1 if there are no duplicated characters

    public static int findDuplicate(String input) throws IOException {

        //steps
        //1. put string into a character array
        //2. take first character and see if any duplicates in string
        //3. if duplicate found, return position
        //4. continue through string and if no duplicate found, return -1

        int count = 0;
        int k = 0;
        int l = 1;

        StringReader stringReader = new StringReader(input);
        char[] charArray = new char[input.length()];
        stringReader.read(charArray);

        boolean flag = true;

        while(flag) {
            for (int i = k; i < charArray.length; i++) {
                //count number of loops
                count = count + 1;
                for (int j = l; j < charArray.length; j++) {
                    // i matches j return position of duplicate
                    if (charArray[i] == charArray[j]) {
                        return j;
                    }
                    //check if all characters were reviewed
                    if (count ==(charArray.length -1)){
                        flag = false;
                    }
                    //continue checking characters in array
                    if (j == (charArray.length - 1)) {
                        k++;
                        l++;
                    }
                }
            }

        }
        return -1;
    }
}
