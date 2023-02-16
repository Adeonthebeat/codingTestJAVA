package practice08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/** $$
 * [동전교환] - DFS | 가장 적은 수
 */
public class Main005 {

    static int n, m, result = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {

        // 합계가 거스름돈보다 많을 때, return
        if(sum > m) {
            return;
        }

        // Level이 result보다 크다면, return
        if(L > result) {
            return;
        }

        if(sum == m) {
            result = Math.min(result, L);
        } else {
            for(int i = 0; i < n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    /*
    3
    1 2 5
    15
    */
    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // [중요] 큰 동전부터 계산을 한다면. 더 빠르다.
        Arrays.sort(arr, Collections.reverseOrder());

        m = input.nextInt();

        main.DFS(0, 0, arr);

        System.out.println(result);

    }

}
