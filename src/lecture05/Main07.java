package lecture05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** $$$$$
 * [교육과정 설계] - Queue || FIFO || LinkedList ||offer || poll || peek || contains
 */
public class Main07 {

    public String solution(String need, String plan){
        String result = "YES";

        Queue<Character> Q = new LinkedList<>();

        // 필수과목 offer
        for(char x : need.toCharArray()){
            Q.offer(x);
        }

        // contains || Q의 맨 앞자리 체크
        for(char x : plan.toCharArray()){
            // 필수과목
            if(Q.contains(x)){
                // 맨 앞에 있는지 체크
                if(x != Q.poll()){
                    return "NO";
                }
            }
        }

        if(!Q.isEmpty()){
            return "NO";
        }

        return result;
    }

/**
CBA
CBDAGE
 */

    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        String n = input.next(); // 필수과목 순서
        String k = input.next(); // 현재 교육설계

        System.out.println(main.solution(n, k));
    }

}
