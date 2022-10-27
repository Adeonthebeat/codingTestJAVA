package lecture05;

import java.util.*;

/** $$$
 * [후위식 연산(postfix)] - Stack || Character.isDigit() || x- 48(0)(ASCII) ||lt, rt || stack.get(0)
 */
public class Main04 {

    public int solution(String str){
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x -48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+'){
                    stack.push(lt + rt);
                } else if(x == '-'){
                    stack.push(lt - rt);
                } else if(x == '*'){
                    stack.push(lt * rt);
                } else if(x == '/'){
                    stack.push(lt / rt);
                }
            }
        }

        // 마지막 남은 값이 정답
        result = stack.get(0);

        return result;
    }

/**
352+*9-
 */

    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));
    }

}
