package practice08;

import java.util.Scanner;

/** $$
 * [바둑이승차] - DFS | 가장 무거운 무게 = max
 */
public class Main002 {

    static int c, n;

    static int result = Integer.MIN_VALUE;

    static int[] arr;

    public void DFS(int L, int sum, int[] arr) {

        // 총 합이 트럭 무게보다 무겁다면, 의미 없음
        if(sum > c) {
            return;
        }

        // Level = n
        if(L == n) {
            result = Math.max(result, sum);
        } else {
            DFS(L+1, sum+arr[L], arr); // 포함
            DFS(L+1, sum, arr); // 미포함
        }
    }

/**
259 5
81
58
42 33 61
*/
    public static void main(String[] args) {
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);

        c = input.nextInt();
        n = input.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        main.DFS(0, 0, arr);

        System.out.println(result);

    }

}
