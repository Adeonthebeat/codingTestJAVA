package lecture08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * [동전교환] - DFS | 최소개수 | 중복순열
 */
public class Main05 {

    static int n, m, result = Integer.MAX_VALUE;

    /**
     * DFS(1, 15) = 1원, 15원(합계)
     * @param L
     * @param sum
     * @param arr
     */
    public void DFS(int L, int sum, Integer[] arr) {

        // 주어진 합계보다 많다면
        if(sum > m) {
            return;
        }

        // 레벨이 답보다 크면 의미가 없음
        if(L >= result) {
            return;
        }

        // 주어진 합계와 같다면
        if(sum == m) {
            result = Math.min(result, L);
        } else {
            // 누적!
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
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // 큰 동전부터 계산을 한다면. 더 빠르다.
        Arrays.sort(arr, Collections.reverseOrder());

        m = input.nextInt();

        main.DFS(0, 0, arr);

        System.out.println(result);

    }
}
