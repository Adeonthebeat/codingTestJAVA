package lecture03;

import java.util.Scanner;

/** $$
 * [연속된 자연수의 합] - (n/2 + n/2+1) = n | lt/rt ->> sliding window
 */
public class Main05 {


    public int solution(int n){
        int result = 0, sum = 0, lt = 0;

        int m = n/2 + 1;        // (n/2 + n/2+1) = n
        int[] arr = new int[m];

        for(int i = 0; i < m; i++){
            arr[i] = i + 1; // 0이 아닌 1부터
        }

        // 똑같음
        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n){
                result++;
            }

            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n){
                    result++;
                }
            }
        }
        return result;
    }

/**
15
*/

    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(main.solution(n));

    }

}
