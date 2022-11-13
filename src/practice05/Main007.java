package practice05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** $$
 * [교육과정 설계] - Queue || contains ||offer || offer(poll()) || poll()
 */
public class Main007 {

    public String solution(String need, String schedule){
        String result = "YES";

        Queue<Character> Q = new LinkedList<>();

        // Queue에 필수과목 입력
        for(char x : need.toCharArray()){
            Q.offer(x);
        }

        // 교육과정
        for(char x : schedule.toCharArray()){
            // 교육과정 중 필수과목이 있다면.
            if(Q.contains(x)){

                // 맨 처음 값이 필수과목이 아니라면. 수업설계 실패
                if(x != Q.poll()){
                    return "NO";
                }
            }
        }

        // 만약 필수과목이 남아있다면. 수업설계 실패
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
        Main007 main = new Main007();
        Scanner input = new Scanner(System.in);

        String need = input.next();
        String schedule = input.next();

        System.out.println(main.solution(need, schedule));

    }

}
