package practice08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** $$
 * [섬나라 아일랜드] - 개수 구하기
 */
class Point14 {
    int x, y;
    public Point14(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main014 {

    static int n, result = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point14> Q = new LinkedList<>(); // BFS

    public void DFS(int x, int y, int[][] board) {

        // BFS
        Q.offer(new Point14(x, y));

        // BFS
        while(!Q.isEmpty()) {
            Point14 pos = Q.poll();
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    int nx = pos.x + dx[i];
                    int ny = pos.y + dy[i];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                        board[nx][ny] = 0;
                        Q.offer(new Point14(nx, ny));
                    }
                }
            }

        }
    }

    public void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    result += 1;
                    board[i][j] = 0;
                    DFS(i, j, board);
                }
            }
        }
    }

    /*  각 섬은 1로 표시 | 0은 바다 | 상하좌 우와 대각선으로 연결
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
        Main014 main = new Main014();
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
