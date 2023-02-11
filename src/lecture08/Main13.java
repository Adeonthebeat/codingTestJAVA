package lecture08;

import java.util.Scanner;

/**
 * [섬나라 아일랜드] - DFS
 */
public class Main13 {

    static int n, result;
    static int[] ch;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 시계방향
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; // 시계방향

    public void DFS(int x, int y, int[][] board) {
        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    result++;
                    board[i][j] = 0; // 출발하는 지점 = 0
                    DFS(i, j, board);
                }
            }
        }

    }

    /**
     7
     1 1 0 0 0 1 0
     0 1 1 0 1 1 0
     0 1 0 0 0 0 0
     0 0 0 1 0 1 1
     1 1 0 1 1 0 0
     1 0 0 0 1 0 0
     1 0 1 0 1 0 0
     */
    public static void main(String[] args) {
        Main13 main = new Main13();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = input.nextInt();
            }
        }

        main.solution(board);

        System.out.println(result);
    }

}
