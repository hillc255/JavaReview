package Calculate;

import java.util.Stack;

public class Calculate {

    public static int calculate(String s) {

        //get length of String
        //check if each character +,-,* or /
        //if not, convert character into number and put in variable
        //as soon as you get +, -, * or / convert this into operator and add it to stack
        //check if length of string is zero

        //solution:  https://github.com/udacity/JDND/blob/master/exercises/c1/exercises/calculator/src/Calculator.java

        int len;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }
        //initialize stack
        Stack<Integer> stack = new Stack<>();
        //setup variabls for number and sign
        int num = 0;
        char sign = '+';

        //loop through characters in the string
        for (int i = 0; i < len; i++) {
            //check if characters are digits
            if (Character.isDigit(s.charAt(i))) {
                //
                num = num * 10 + s.charAt(i) - '0';
            }
            //if char is not digit or the index is less then length -1
            if (!Character.isDigit(s.charAt(i)) || i == len - 1) {
                //check if the char is a minus and perform operation
                if (sign == '-') {
                    stack.push(-num);
                }
                //check if sign is a plus and perform operation
                if (sign == '+') {
                    stack.push(num);
                }
                //check if sign is times perform operation
                if (sign == '*') {
                    //pop first number and multiply it
                    stack.push(stack.pop() * num);
                }
                //reset sign and numb
                sign = s.charAt(i);
                num = 0;
            }
        }
         //check numbers in stack add one by one
        int ans = 0;
        for (int i : stack) {
            ans += i;
        }
        return ans;
        }
}
