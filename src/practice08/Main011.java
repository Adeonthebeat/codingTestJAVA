package practice08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** $$
 * [미로탐색] - DFS
 */
class Point11 {
    int x, y;
    public Point11(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main011 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public void BFS(int x, int y) {
        Queue<Point11> Q = new LinkedList<>();

        Q.offer(new Point11(x, y));

        while(!Q.isEmpty()) {
            Point11 temp = Q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point11(nx, ny));           // [중요]
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;  // [중요]
                }
            }
        }

    }

/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
*/
    public static void main(String[] args) {
        Main011 main = new Main011();
        Scanner input = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                board[i][j] = input.nextInt();
            }
        }

        main.BFS(1, 1);

        // 맨 마지막 값 출력
        if(dis[7][7] == 0) {
            System.out.println();
        } else {
            System.out.println(dis[7][7]);
        }

    }

}
