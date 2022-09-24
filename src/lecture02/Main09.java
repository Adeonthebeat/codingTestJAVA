package lecture02;

import java.util.*;

/** $$$
 * [격자판 최대합] - 이중 for문 및 공식
 */
public class Main09 {

    public int solution(int n, int[][] arr){
        int result = Integer.MIN_VALUE;
        int sum1, sum2;

        for(int i = 0; i < n; i++){
            sum1 = sum2 = 0;

            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        sum1 = sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);
        return result;
    }

    public static void main(String[] args) {
        Main09 main = new Main09();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }

        }
        System.out.println(main.solution(n, arr));
    }

}
