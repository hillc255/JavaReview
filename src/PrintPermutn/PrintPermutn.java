package PrintPermutn;

public class PrintPermutn {

    //Give an array with unique integers, print all permutations.
    //solution: https://github.com/udacity/JDND/tree/master/exercises/c1/exercises

    public static void printPermutn(int[] arr, int index)
    {

        int size = arr.length;

        if (size == index + 1) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = index; i < size; i++) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                printPermutn(arr, index + 1);  //recursive call for each string
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        printPermutn(arr, 0);
    }

}
