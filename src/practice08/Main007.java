package practice08;

import java.util.Scanner;

/** $$
 * [조합의 경우수] - 메모이제이션 | 5C3 = 4C2 + 4C3 ->  5가 참가했거나 안했거나
 */
public class Main007 {

    static int[][] dy = new int[35][35];

    public int DFS(int n, int r) {

        // 값 체크 -> 값이 있다면, 접근을 하지 않음
        if(dy[n][r] > 0) {
            return dy[n][r];
        }

        // 5C3 => 3 = 3 ->> 1 || 0이라면, 1
        if(n == r || r == 0) {
            return 1;
        } else {
            // 5C3 = 4C2 + 4C3
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    /*
    5 3
    */
    public static void main(String[] args) {
        Main007 main = new Main007();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(main.DFS(n, m));

    }

}
