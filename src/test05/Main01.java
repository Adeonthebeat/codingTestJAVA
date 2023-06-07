package test05;

import java.util.Scanner;
import java.util.Stack;

/**
 * [올바른 괄호]
 */
public class Main01 {

    public String solution(String str) {
        String result = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return "NO";
        }

        return result;
    }

/*
(()(()))(()
(((())))
*/

    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
