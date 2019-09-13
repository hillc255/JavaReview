package MapAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAndSet {

    //solution:  https://github.com/udacity/JDND/blob/master/exercises/c1/exercises

    public static String mapAndSet( String[] input){

        String output = "";
        int count = 0;
        int j = 1;

        //Given a list of strings, calculate and print
        // the frequency of each string based on alphabetical order.

        //make sure the list is not empty
        //take the first string and put it in a temp file
        //check to see if any other strings in the list

        // Creating a HashMap containing String
        // as a key and occurrences as  a value
        TreeMap<String, Integer> freqMap
                = new TreeMap<>();
             for (String str : input){

                 count = count + 1;
                    //if string is present count it by 1
                    freqMap.put(str, freqMap.getOrDefault(str,0) + 1);
                }
         //print results
            for(String word: freqMap.keySet()){
                System.out.println(word + "|" + freqMap.get(word));
                j++;
                if (j < count) {
                    output = output + (word + "|" + freqMap.get(word)) + " ";
                    j++;
                }
                else{
                    output = output + (word + "|" + freqMap.get(word));
                }
            }

        return output;
    }
}
