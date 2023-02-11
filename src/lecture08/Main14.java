package lecture08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * [섬나라 아일랜드] - BFS
 */
class Point14 {
    public int x, y;
    Point14(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main14 {

    static int n, result = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point14> Q = new LinkedList<>();

    public void BFS(int x, int y, int[][] board) {
        Q.add(new Point14(x, y));
        while(!Q.isEmpty()) {
            Point14 pos = Q.poll();
            for(int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.add(new Point14(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] board) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    result++;
                    board[i][j] = 0;
                    BFS(i, j, board);
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
        Main14 main = new Main14();
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
