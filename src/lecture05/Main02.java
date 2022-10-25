package lecture05;

import java.util.Scanner;
import java.util.Stack;

/** $$$
 * [괄호문자제거] - Stack
 */
public class Main02 {

    public String solution(String str){
        String result = "";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){

            if(x == ')'){
                // 꺼낸 값 Return
                while(stack.pop() != '(');
            }
            // 닫는 괄호전 여는 괄호까지 모두 제거
            else {
                stack.push(x);
            }

        }

        for(int i = 0; i < stack.size(); i++){
            result += stack.get(i);
        }

        return result;
    }

/**
(A(BC)D)EF(G(H)(IJ)K)LM(N)
 */

    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));
    }

}
