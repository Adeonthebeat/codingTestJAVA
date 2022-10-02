package practice02;

import java.util.Scanner;

/** $$$$
 * [멘토링] - pi ps(사중 for문)
 */
public class Main012 {

    public int solution(int n, int m, int[][] arr){
        int result = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){ // 4x4 - 모든 경우의 수
                // {i, j}일 때, 비교
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){ // 등수
                        if(arr[k][s] == i){
                            // 해당하는 학생이라면, 등수를 get
                            pi = s;
                        }

                        if(arr[k][s] == j){
                            pj = s;
                        }
                    }
                    if(pi < pj){ // 순위가 크다. ex) pi가 1등 pj는 3등
                        cnt++;
                    }
                }
                // 태스트 개수를 통과하면 멘토 멘티가 될 수 있음.
                if(cnt == m){
                    result++;
                }
            }
        }

        return result;
    }
/**
4 3
3 4 1 2
4 3 2 1
3 1 4 2
 */

    public static void main(String[] args) {
        Main012 main = new Main012();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, m, arr));
    }
}
