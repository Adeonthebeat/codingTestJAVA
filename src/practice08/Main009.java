package practice08;

import java.util.Scanner;

/** $$
 * [조합 구하기] - DFS
 */
public class Main009 {

    static int n, m;
    static int[] combination;

    public void DFS(int L, int s) {
        // Level = 조합 개수
        if(L == m) {
            for(int x : combination) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            // 조합을 외워버리자.
            for(int i = s; i <= n; i++) {
                combination[L] = i;
                // 조합 중요! = DFS(1, 2) -> DFS(1, 3) -> DFS(1, 4)
                DFS(L+1, i+1);
            }
        }
    }
    /*
    4 2
    */
    public static void main(String[] args) {
        Main009 main = new Main009();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        combination = new int[m];

        main.DFS(0, 1);

    }

}
