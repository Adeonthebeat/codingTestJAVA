package lecture08;

import java.util.Scanner;

/**
 * [조합 구하기] -
 */
public class Main09 {

    static int n, m;

    static int[] combination;

    public void DFS(int L, int s) {

        if(L == m) {
            for(int x : combination) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            // 조합을 외워버리자.
            for(int i = s; i <= n; i++) {
                combination[L] = i;
                DFS(L+1, i+1); // 중요!
            }
        }

    }

    /*
    4 2
    */
    public static void main(String[] args) {
        Main09 main = new Main09();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        combination = new int[m];

        main.DFS(0, 1);

    }
}
