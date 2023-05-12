package test02;

import java.util.Scanner;

/**
 * [임시반장 정하기]
 */
public class Main11 {

    public int solution(int n, int[][] arr) {
        int result = 0, max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= 5; k++) {
                    // 행열 구분! - 행이 학생이고, 열이 학년임
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
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

        // 5학년 + 1년
        int[][] arr = new int[n+1][6];

        // 학생 수
        for(int i = 1; i <= n; i++) {
            // 5학년
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }

}
