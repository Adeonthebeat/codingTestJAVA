package lecture05;

import java.util.Scanner;
import java.util.Stack;

/** $$$
 * [크레인 인형뽑기(카카오)] - Stack || peek() || if(board[i][pos-1] != 0)
 */
public class Main03 {

    public int solution(int n, int[][] board, int k, int[] moves){
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(int pos : moves){ // 열 = target
            for(int i = 0; i < board.length; i++){ // 행크기
                // 비어있지 않다면
                if(board[i][pos-1] != 0){
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && temp == stack.peek()){
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break; // 반드시 멈춰줘야함!
                }
            }
        }

        return result;
    }

/**
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */

    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = input.nextInt();
            }
        }

        int k = input.nextInt();
        int[] moves = new int[k];

        for(int i = 0; i < k; i++){
            moves[i] = input.nextInt();
        }

        System.out.println(main.solution(n, board, k, moves));
    }

}
