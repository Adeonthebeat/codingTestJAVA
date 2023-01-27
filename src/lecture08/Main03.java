package lecture08;

import java.util.*;

/**
 * [최대점수 구하기] - DFS | 최대 점수
 */
public class Main03 {

    static int n, m;

    static int result = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {

        // Time이 주어진 시간보다 많다면, return
        if(time > m) {
            return;
        }

        if(L == n) {
            result = Math.max(result, sum);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }

    }
/**
 첫 번째 줄에 문제의 개수N(1<=N<=20)과 제한 시간
 두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간
 */
    /**
     5 20
     10 5
     25 12
     15 8
     6 3
     7 4
     */
    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }

        main.DFS(0, 0, 0, a, b);

        System.out.println(result);

    }
}
