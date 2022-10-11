package practice03;

import java.util.Scanner;

/**
 * [연속 부분수열] - rt || if(sum == m){
 */
public class Main004 {

    public int solution(int n, int m, int[] arr){
        int result = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m){
                result++;
            }

            while(sum > m){
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
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
