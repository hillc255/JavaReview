package BinarySearch;


public class BinarySearch {


    public static int findTarget(int[] arr, int target) {

        int mid = 0;

        if (arr.length == 0) return -1;

        //If length of array greater than 1
        if (arr.length >= 1)
            mid = 1 + (arr.length - 1) / 2;

        // If target is present at the middle
        if (arr[mid] == target)
            return mid;

        //look at contents of array and check if greater than target
        // if true, execute function again
        if (arr[mid] > target)
            return findTarget(arr, target);

        //if contents is less than target - loop throw until find target
        if (arr[mid] < target)

            for (int i = 0; i < arr.length; i++)
                if (arr[i] == target)
                    return i;

        return -1;

    }
}
