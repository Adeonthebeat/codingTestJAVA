package practice08;

import java.util.Scanner;

/** $$
 * [합이 같은 부분집합] - DFS
 */
public class Main001 {

    static int n, total = 0;

    static String result = "NO";

    static boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {

        if(flag) {
            return;
        }

        if(sum > (total/2)) {
            return;
        }

        // Level = n
        if(L == n) {
            if((total - sum) == sum) {
                result = "YES";
                flag = true;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }

    }

    /**
     6
     1 3 5 6 7 10
     */

    public static void main(String[] args) {
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            total += arr[i];
        }

        main.DFS(0, 0, arr);

        System.out.println(result);
    }

}
