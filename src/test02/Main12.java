package test02;

import java.util.Scanner;

/**
 * [멘토링]
 */
public class Main12 {

    public int solution(int n, int m, int[][] arr) {
        int result = 0;

        // 4중 for문
        for(int i = 1; i <= n; i++) { // 순위
            for(int j = 1; j <= n; j++) { // 순위
                int cnt = 0;
                for(int k = 0; k < m; k++) { // 학생 수
                    int pi = 0, pj = 0;

                    for(int s = 0; s < n; s++) { // 테스트 수
                        if(arr[k][s] == i) { // 학생을 찾았을 때
                            pi = s;
                        }
                        if(arr[k][s] == j) { // 학생을 찾았을 때
                            pj = s;
                        }
                    }
                    if(pi < pj) {
                        cnt++;
                    }
                }
                if(cnt == m) {
                    result++;
                }
            }
        }

        return result;
    }


    /*
    4 3
    3 4 1 2
    4 3 2 1
    3 1 4 2
    */
    public static void main(String[] args) {
        Main12 main = new Main12();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(main.solution(n, m, arr));
    }

}
