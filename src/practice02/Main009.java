package practice02;

import java.util.Scanner;

/** $$$
 * [격자판 최대합] - 이중 for sumX sumY
 */
public class Main009 {

    public int solution(int n, int[][] arr){
        int result = Integer.MIN_VALUE;

        int sumX, sumY;

        for(int i = 0; i < n; i++){
            sumX = sumY = 0;

            for(int j = 0; j < n; j++){
                sumX += arr[i][j];
                sumY += arr[j][i];
            }

            result = Math.max(result, sumX);
            result = Math.max(result, sumY);
        }

        sumX = sumY = 0;

        for(int i = 0; i < n; i++){
            sumX += arr[i][i];
            sumY += arr[i][n-i-1];
        }
        result = Math.max(result, sumX);
        result = Math.max(result, sumY);

        return result;
    }

/**
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
*/
    public static void main(String[] args) {
        Main009 main = new Main009();
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
