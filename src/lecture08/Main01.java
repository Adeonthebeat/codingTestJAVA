package lecture08;

import java.util.*;

/**
 * [합이 같은 부분집합] - DFS | 아마존 인터뷰 | sum! | total | 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력
 */
public class Main01 {

    static int n, total = 0;

    static String result = "NO";

    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {

        // false 라면 return.
        if(flag) {
            return;
        }

        // sum 값이 total - sum(total/2) 보다 크다면 리턴
        if(sum > total / 2){
            return;
        }

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

    public static void main(String[] args) {
        Main01 main = new Main01();
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
