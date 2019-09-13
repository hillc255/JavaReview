package FindDuplicate;


import java.io.IOException;
import java.io.StringReader;
import java.nio.Buffer;
import java.util.Arrays;

public class FindDuplicate {


    public static int findDuplicate(String input) throws IOException {

        int output = 0;

        // given a string return the index of the first duplicated character
        // or -1 if there are no duplicated characters

        //steps
        //1. put string into a buffer
        //2. take first character and see if any duplicates in string
        //3. if duplicate found, return position
        //4. continue through string and if no duplicate found, return -1

       StringReader stringReader = new StringReader(input);

      //  char[] charArray = new char[input.length()];
       // stringReader.read(charArray);

      //ls -  input = reader.next();

       //System.out.println(Arrays.toString(charArray));

      // int ch;

      //  while((position = stringReader.read())!= -1) {
//        for (int i =0; i < input.length(); i++) {
//           // ch = stringReader.read(0);
//        }
           // System.out.print((char) position);
       // }

       // stringReader.close();
        return output;
    }

}
