package lecture08;

import java.util.Scanner;

/**
 * [중복순열 구하기] - for문 들어간 부분집합
 */
public class Main04 {

    static int[] pm;

    static int n, m;

    public void DFS(int L) {

        // m개를 다 뽑으면
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            // n번 호출
            for(int i = 1; i <= n; i++) {
                pm[L] = i; // 상태트리
                DFS(L+1);
            }
        }

    }
    /*
    3 2
    */
    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        pm = new int[m];

        main.DFS(0);

    }
}
