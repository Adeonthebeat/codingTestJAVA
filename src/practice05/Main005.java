package practice05;

import java.util.Scanner;
import java.util.Stack;

/** $$$
 * [쇠막대기] - 우선 push || 우선 pop || i-1 ||size
 */
public class Main005 {

    public int solution(String str){
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            // 여는 괄호라면, push
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else {
                // 닫는 괄호라면, pop
                stack.pop();

                if(str.charAt(i-1) == '('){
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        return result;
    }

/**
()(((()())(())()))(())
17
(((()(()()))(())()))(()())
24
*/
    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
