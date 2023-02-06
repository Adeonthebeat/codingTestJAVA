package lecture08;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * [토마토] - BFS | 최소 일수를 출력
 */
class Point12 {

    public int x, y;

    Point12(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
public class Main12 {

    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static Queue<Point12> Q = new LinkedList<>();

    public void BFS(){

        while(!Q.isEmpty()) {
            Point12 temp = Q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point12(nx, ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }

    }

    /* 정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸
    6 4
    0 0 -1 0 0 0
    0 0 1 0 -1 0
    0 0 -1 0 0 0
    0 0 0 0 -1 1
    */
    public static void main(String[] args) {
        Main12 main = new Main12();
        Scanner input = new Scanner(System.in);

        m = input.nextInt();
        n = input.nextInt();

        board = new int[n][m];
        dis = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = input.nextInt();
                // 토마토가 익은 것.
                if(board[i][j] == 1) {
                    Q.offer(new Point12(i, j));
                }
            }
        }

        main.BFS();

        /**
         * 저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고, 토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.
         */
        boolean flag = true;
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 0){
                    flag = false;
                }
            }
        }

        // 만약 안익은 토마토가 없다면.
        if(flag) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    // 토마토가 다 익는 최대 일수
                    result = Math.max(result, dis[i][j]);
                }
            }
            System.out.println(result);
        } else {
            // 안 익은 토마토
            System.out.println(-1);
        }

    }
}
