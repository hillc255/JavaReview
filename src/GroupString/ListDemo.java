package GroupString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static List<String>[] groupString(List<String> input) {

        //create 3 lists
        List<String>[] ans = new List[3];

        //if first character in list begins with a
        //add string to list
        for (String in : input) {
            if (in.charAt(0) == 'a') {
                List<String> lst;

                //if first character is null
                //create new list
                if (ans[0] == null) {
                    lst = new ArrayList<>();
                    //else continue to first charater in next string
                } else {
                    lst = ans[0];
                }
                //add the next string to the list with first character a
                lst.add(in);
                ans[0] = lst;

                //if first character in string in list is b add it to list
            } else if (in.charAt(0) == 'b') {
                List<String> lst;
                if (ans[1] == null) {
                    lst = new ArrayList<>();
                } else {
                    lst = ans[1];
                }
                lst.add(in);
                ans[1] = lst;

                // create third list for everything else
            } else {
                List<String> lst;
                if (ans[2] == null) {
                    lst = new ArrayList<>();
                } else {
                    lst = ans[2];
                }
                lst.add(in);
                ans[2] = lst;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        for (List<String> lst : groupString(input)) {
            System.out.println(lst);
           // System.out.println();
        }
    }
}