package ReverseString;

//https://github.com/udacity/JDND/blob/master/exercises/c1/exercises/reverse-string/src/ReverseString.java

public class ReverseStringDemo{

        public static String reverseStringDemo(String str) {
            StringBuilder sb = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i --) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }

}
