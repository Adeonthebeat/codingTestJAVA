package practice08;

import java.util.Scanner;

/** $$
 * [중복순열 구하기] - DFS
 */
public class Main004 {

    static int n, m;

    static int[] pm;

    public void DFS(int L) {
        // Level = 뽑는 횟수
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    /*
    3 2
    */
    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        n = input.nextInt(); // 번호
        m = input.nextInt(); // 뽑는 횟수

        // 순열 리스트
        pm = new int[m];

        main.DFS(0);

    }

}
