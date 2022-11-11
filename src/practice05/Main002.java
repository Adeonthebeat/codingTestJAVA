package practice05;

import java.util.Scanner;
import java.util.Stack;

/** $$
 * [괄호문자제거]
 */
public class Main002 {

    public String solution(String str){
        String result = "";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == ')'){
                while (stack.pop() != '('); // '('까지 제거
            } else {
                stack.push(x); //')'가 아니라면, push
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
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);


        String str = input.next();

        System.out.println(main.solution(str));

    }

}
