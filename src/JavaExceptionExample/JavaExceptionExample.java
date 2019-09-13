package JavaExceptionExample;

import java.util.List;

public class JavaExceptionExample {

        public static void main(String args[]){

            try{
                //code that may raise exception
               // int data=100/0;
                int output = testException();
               // testException2();

            }catch(ArithmeticException e){System.out.println(e);}
            //rest code of the program
            System.out.println("rest of the code...");
        }

        public static int testException(){

            int output;

            //1.thows exception as list size is null
           // List<Integer> lst = null;
           // int size = lst.size();

            //2. throws exception string to int
            //String s = "FOOBAR";
           // int i = Integer.parseInt(s);

            //thows execption because size of array is 2
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
            output = (a[3]);

            return output;
        }

        public static void testException2(){

            //this will throw exceptions as result is not int
            int data = 10/0;
        }

}
