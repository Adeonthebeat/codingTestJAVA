package lecture10;

import java.util.Scanner;

/**
 * [돌다리 건너기] - 동적계획법 | 큰 문제를 작게 쪼개서 푸는 방법 | 피보나치
 */
public class Main02 {

    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        // 개울가를 건너려면 한 번 더 가야함.
        for(int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n+1];
    }

    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // 중요 - 개울가를 건너려면 한 번 더 가야함.
        dy = new int[n+2];

        System.out.println(main.solution(n));

    }

}
