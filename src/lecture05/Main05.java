package lecture05;

import java.util.Scanner;
import java.util.Stack;

/** $$$$$
 * [쇠막대기] - Stack || 레이저와 막대기 끝 구분
 */
public class Main05 {

    public int solution(String str){
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else {
                // 닫는 괄호면 무조건 뺀다.

                stack.pop();
                // 레이저라면, 바로 앞에 '('가 있다면, 레이져이며, 빼고 계산
                if(str.charAt(i-1) == '('){
                    result += stack.size();
                } else {
                    // 바로 앞에 ')'라면 막대기 끝 = + 1
                    result++;
                }
            }
        }

        return result;
    }

/**
()(((()())(())()))(())
 */

    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));
    }

}
