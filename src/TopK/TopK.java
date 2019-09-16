package TopK;

import java.util.Arrays;

public class TopK {

    public static int[] topk(int[] numArray, int k){

        // numArray is sorted
        Arrays.sort(numArray);

        //verify numArray is sorted
        for (int i = 0; i < numArray.length; i++) {

            System.out.println(numArray[i]);;
        };
        //get subArray having the last k digits
        int beg = numArray.length - k;
        int end = numArray.length;

        System.out.println("beginning of new array index = " + beg);
        System.out.println("end of new array inext =" + end);

        int[] expectedArray = Arrays.copyOfRange(numArray, beg, end);

        for (int i = 0; i < expectedArray.length; i++) {

            System.out.println(expectedArray[i]);;
        };

        return expectedArray;
    }
}
