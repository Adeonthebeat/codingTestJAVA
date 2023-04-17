package lecture10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [동전교환] - 냅색 알고리즘 | 가장 적은 수의 동전
 */
public class Main05 {

    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {

        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0] = 0;

        for(int i = 0; i < n; i++) {
            for(int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
            }
        }
        return dy[m];
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

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        m = input.nextInt();

        // dy[i] : i 금액을 만들기 위한 최소 동전 개수
        dy = new int[m+1];

        System.out.println(main.solution(arr));

    }
}
