package lecture08;

import java.util.Scanner;

/**
 * [조합 경우의 수] - 메모이제이션(피보나치)
 */
public class Main07 {

    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {

        if(dy[n][r] > 0) {
            return dy[n][r];
        }

        // 조합이 1일 떼!
        if(n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n-1, r-1)+DFS(n-1, r);
        }

    }

/*
5 3
33 19
*/
    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();

        System.out.println(main.DFS(n, r));


    }
}
