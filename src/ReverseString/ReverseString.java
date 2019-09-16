package ReverseString;

import java.util.Stack;

public class ReverseString {

   // Write a function that takes a string as input and returns the string reversed.
   // Example1: input: "Hello World!", return "!dlroW olleH"
   // Example2: input: “abcde”, return “edcba”

    //https://www.techiedelight.com/reverse-a-string-using-stack-in-java/

    public static String reverseString(String str) {

        //base case: if string is null or empty
        if(str == null|| str.equals(""))
            return str;

        //create empty stack of characters
        Stack<Character> stack = new Stack<Character>();

        //push every character of string into stack
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
            stack.push(ch[i]);

        //start from index 0
        int k = 0;

        //pop charaters from stack until it is empty
        while(!stack.isEmpty())
        {
            //assign each popped character back to the character array
            ch[k++] = stack.pop();
        }
        //convert character array into string and return
        String output = String.copyValueOf(ch);
        System.out.println(output);

        return output;

    }
}
