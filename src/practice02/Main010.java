package practice02;

import java.util.Scanner;

/** $$$
 * [격자판 최대합] - 이중 for sumX sumY
 */
public class Main010 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr){
        int result = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean flag = true;

                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < n &&arr[nx][ny] > arr[i][j]){
                        flag = false;
                    }
                }
                if(flag){
                    result++;
                }
            }
        }

        return result;
    }
/**
 5
 5 3 7 2 3
 3 7 1 6 1
 7 2 5 3 4
 4 3 6 4 1
 8 7 3 5 2
 */

    public static void main(String[] args) {
        Main010 main = new Main010();
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
