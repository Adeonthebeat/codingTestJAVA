package lecture10;

import java.util.Scanner;

/**
 * [최대점수 구하기] - 냅색 알고리즘 | 가장 큰 점수 구하기
 */
public class Main06 {


/*
5 20
10 5
25 12
15 8
6 3
7 4
*/

    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] dy = new int[m+1];

        for(int i = 0; i < n; i++) {
            int ps = input.nextInt();
            int pt = input.nextInt();

            // Developer Kick - 문제를 풀 때, 중복되지 않도록 거꾸로 for문
            for(int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt] + ps);
            }
        }

        System.out.println(dy[m]);

    }

}
