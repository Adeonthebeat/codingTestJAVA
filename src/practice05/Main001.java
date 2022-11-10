package practice05;

import java.util.*;

/** $$
 * [올바른 괄호] - isEmpty
 */
public class Main001 {

    public String solution(String str){
        String result = "";

        // Stack Definition
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            } else {
                // ')' 혼자 나왔다면.
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop(); // '(' pop
            }
        }

        if(!stack.isEmpty()){
            return "NO";
        }

        return result;
    }

    public static void main(String[] args) {
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);

        /**
         (()(()))(()
         */
        String str = input.next();

        System.out.println(main.solution(str));

    }

}
