package lecture05;

import java.util.Scanner;
import java.util.Stack;

/** $$$
 * [올바른 괄호] - Stack(LIFO) || Queue(FIFO)
 */
public class Main01 {

    public String solution(String str){
        String result = "YES";

        Stack<Character> stack = new Stack<>();

        // Stack
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            } else {
                // 만약 비어있는지 확인
                if(stack.isEmpty()){
                   return "NO";
                }
                stack.pop();
            }
        }

        // 남아 있다면, 'NO'
        if(!stack.isEmpty()){
            return "NO";
        }

        return result;
    }

/**
(()(()))(()
 */

    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));
    }

}
