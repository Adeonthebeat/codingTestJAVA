package test02;

import java.util.Scanner;

/**
 * [봉우리]
 */
public class Main10 {

    static int[] dx = {-1, 0, 1, 0}; // 북남
    static int[] dy = {0, 1, 0, -1}; // 동서

    public int solution(int n, int[][] arr) {
        int result = 0;

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                boolean flag = true;

                for(int k = 0; k < 4; k++) {
                    int nx = x + dx[k]; // 행좌표
                    int ny = y + dy[k]; // 열좌표

                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[x][y]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    result++;
                }

            }
        }
        return result;
    }
    /*
    5
    5 3 7 2 3
    3 7 1 6 1
    7 2 5 3 4
    4 3 6 4 1
    8 7 3 5 2
    */
    public static void main(String[] args) {
        Main10 main = new Main10();
        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
