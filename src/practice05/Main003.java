package practice05;

import java.util.Scanner;
import java.util.Stack;

/** $$$
 * [크레인 인형뽑기(카카오)] - 바꿔치기 || target 먼저!
 */
public class Main003 {

    public int solution(int n, int[][] board, int k, int[] moves){
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for(int pos : moves){
            for(int i = 0; i < n; i++){
                if(board[i][pos-1] != 0){
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == temp){
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
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
        Main003 main = new Main003();
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
