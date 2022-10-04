package lecture03;

import java.util.Scanner;

/** $$$
 * [연속 부분수열] - lt rt ->> sliding window
 */
public class Main04 {


    public int solution(int n, int m, int[] arr){
        int result = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m){
                result++;
            }
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m){
                    result++;
                }
            }
        }
        return result;
    }

/**
8 6
1 2 1 3 1 1 1 2
*/

    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, m, arr));

    }

}
