package practice05;

import java.util.*;

/** $$$
 * [공주 구하기] - Queue || offer || offer(poll()) || poll()
 */
public class Main006 {

    public int solution(int n, int k){
        int result = 0;

        Queue<Integer> Q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            Q.offer(i);
        }

        while (!Q.isEmpty()){

            for(int i = 1; i < k; i++){
                Q.offer(Q.poll());
            }

            // 첫번째 대상 제외
            Q.poll();

            if(Q.size() == 1){
                result = Q.poll();
            }
        }

        return result;
    }

/**
8 3
*/
    public static void main(String[] args) {
        Main006 main = new Main006();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(main.solution(n, k));

    }

}
