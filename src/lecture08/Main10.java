package lecture08;


import java.util.Scanner;

/**
 * [미로탐색] - DFS | 경우의 수를 출력
 */
public class Main10 {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int result = 0;

    public void DFS(int x, int y) {
        if(x == 7 && y == 7) {
            result += 1;
        } else {
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0)  {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
*/
    public static void main(String[] args) {
        Main10 main = new Main10();
        Scanner input = new Scanner(System.in);

        board = new int[8][8];

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++){
                board[i][j] = input.nextInt();
            }
        }

        board[1][1] = 1;
        main.DFS(1, 1);

        System.out.println(result);

    }
}
