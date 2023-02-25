package practice08;

import java.util.Scanner;

/** $$
 * [수열 추측하기] - DFS | 파스칼의 삼각형 | (3C0 + 3C1 + 3C2 + 3C3)
 */
public class Main008 {

    static int[] b, p, ch; // Combination, 순열, 체크
    static int n, f; // f = Final Number
    boolean flag = false;
    int[][] dy = new int[35][35];

    /**
     * 조합의 경우수
     * @param n
     * @param r
     * @return
     */
    public int combination(int n, int r) {

        if(dy[n][r] > 0) {
            return dy[n][r];
        }

        if(n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combination(n-1, r-1) + combination(n-1, r);
        }

    }

    public void DFS(int L, int sum) {

        if(flag) {
            return;
        }

        // Level = 개수
        if(L == n) {
            if(sum == f) {
                for(int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            // 순열을 만들기 = index (x)
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i; // 가장 중요(index 아님)
                    DFS(L+1, sum+(p[L]*b[L])); // 가장 중요
                    ch[i] = 0;
                }
            }
        }
    }

    /*
    4 16
    */
    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        f = input.nextInt();

        b = new int[n]; // Combination
        p = new int[n]; // 순열
        ch = new int[n+1]; // 체크(1~n)

        // Combination 세팅
        // (3C0 + 3C1 + 3C2 + 3C3)
        for(int i = 0; i < n; i++) {
            b[i] = main.combination(n-1, i);
        }

        main.DFS(0, 0);

    }

}
