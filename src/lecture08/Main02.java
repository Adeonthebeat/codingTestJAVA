package lecture08;

import java.util.*;

/**
 * [바둑이 승차] - DFS | 가장 무겁게 | 부분 잡헙
 */
public class Main02 {

    static int c, n;

    static int result = Integer.MIN_VALUE;

    static int[] arr;

    public void DFS(int L, int sum, int[] arr) {

        if(sum > c) {
            return;
        }

        // Level = input
        if(L == n) {
            result = Math.max(result, sum);
        } else {
            DFS(L+1, sum+arr[L] , arr); // 포함
            DFS(L+1, sum , arr); // 불포함
        }
    }
/**
259 5
81
58
42 33 61
*/
    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        c = input.nextInt();
        n = input.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        main.DFS(0, 0, arr);

        System.out.println(result);

    }
}
