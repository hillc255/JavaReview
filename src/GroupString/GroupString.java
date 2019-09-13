package GroupString;

import java.util.Comparator;
import java.util.List;

//ordering a list of strings

//solution: https://github.com/udacity/JDND/tree/master/exercises/c1/exercises

public class GroupString {

    public static List<String> groupString(List<String> input) {

       input.sort( Comparator.comparing( String::toString ) );

        return input;
    }
}
