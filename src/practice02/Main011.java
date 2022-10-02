package practice02;

import java.util.Scanner;

/** $$$
 * [임시반장 정하기] - 열끼리 비교(삼중 for문)
 */
public class Main011 {

    public int solution(int n, int[][] arr){
        int result = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){ // 힉년(열)
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                result = i; // 학생 번호
            }
        }

        return result;
    }
/**
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
 */

    public static void main(String[] args) {
        Main011 main = new Main011();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] arr = new int[n+1][6]; // 1학년~6학년

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
