package lecture05;

import java.util.*;

/** $$$$$
 * [공주 구하기] - Queue || FIFO || LinkedList ||offer || poll || peek || contains
 */
public class Main06 {

    public int solution(int n, int k){
        int result = 0;

        Queue<Integer> Q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            Q.offer(i); // Setting.
        }

        // Queue가 비어있지 않다면.
        while(!Q.isEmpty()){
            // k - 1까지 offer (뒤로)
            for(int i = 1; i < k; i++){
                Q.offer(Q.poll()); // 빼고 뒤로
            }
            // k번째는 poll
            Q.poll();

            // 큐의 사이즈가 1이라면.
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
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(main.solution(n, k));
    }

}
