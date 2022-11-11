package practice05;

import java.util.Scanner;
import java.util.Stack;

/** $$
 * [후위식 연산] - (char - 48(0)) = 숫자 || 대문자(65-90) || 소문자(97-122)
 */
public class Main004 {

    public int solution(String str){
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x - 48); // char - 48은 숫자!
            } else {
                int rt = stack.pop(); // 먼저 나온것이 뒤
                int lt = stack.pop(); // 뒤에 나온게 앞

                if(x == '+'){
                    stack.push(lt + rt);
                } else if(x == '-'){
                    stack.push(lt - rt);
                } else if(x == '*'){
                    stack.push(lt * rt);
                }  else {
                    stack.push(lt / rt);
                }
            }
        }

        result = stack.get(0);

        return result;
    }

/**
352+*9-
*/
    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
