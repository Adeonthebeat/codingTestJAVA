package lecture02;

import java.util.Scanner;

/** $$$
 * [임시반장 정하기] - 3중 for문 및 break
 */
public class Main11 {

    public int solution(int n, int[][] arr){
        int result = 0, max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){ // 학생
            int cnt = 0;
            for(int j = 1; j <= n; j++){ // 학년
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                result = i;
            }
        }

        return result;
    }
    /*
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
     */
    public static void main(String[] args) {
        Main11 main = new Main11();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n+1][6]; // 1번부터 5학년까지
        for(int i = 1; i <= n; i++){ // 학생수
            for(int j = 1; j <= 5; j++){ // 5학년까지
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }

}
