package lecture10;

import java.util.Scanner;

/**
 * [계단오르기] - 동적계획법 | 큰 문제를 작게 쪼개서 푸는 방법 | 피보나치
 */
public class Main01 {

    static int[] dy;

    public int solution(int n) {

        // 초기화
        dy[1] = 1; // 1번째 계단까지 1개
        dy[2] = 2; // 2번째 계단까지 2개

        for(int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        dy = new int[n+1];

        System.out.println(main.solution(n));

    }
}
