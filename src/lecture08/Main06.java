package lecture08;

import java.util.Scanner;

/**
 * [순열 구하기] - 체크의 기준은 n! | pm[L] = arr[i];
 */
public class Main06 {

    static int n, m;

    static int[] pm, ch, arr;

    public void DFS(int L) {
        // 2개라면.
        if(L == m) {
            for(int x :pm) {
                System.out.print(x +" ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                // 중복체크
                if(ch[i] == 0) {
                    ch[i] = 1; // 체크
                    pm[L] = arr[i]; // 제일 중요
                    DFS(L+1);
                    ch[i] = 0; // 체크 풀기
                }

            }
        }
    }

    /*
    3 2
    3 6 9
    */
    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        arr = new int[n];
        pm = new int[m];
        ch = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        main.DFS(0);

    }
}
