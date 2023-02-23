package practice08;

import java.util.Scanner;

/** $$
 * [순열 구하기] - DFS | 경우의 수 | n! | pm[L] = arr[i];
 */
public class Main006 {

    static int n, m;
    static int[] arr, ch, pm;

    public void DFS(int L) {
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }
/*
3 2
3 6 9
*/
    public static void main(String[] args) {
        Main006 main = new Main006();
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
