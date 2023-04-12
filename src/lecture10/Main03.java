package lecture10;

import java.util.Scanner;

/**
 * [최대 부분 증가수열] - 동적계획법 | 큰 문제를 작게 쪼개서 푸는 방법
 */
public class Main03 {

    static int[] dy;

    public int solution(int[] arr) {
        int result = 0;

        dy = new int[arr.length];

        dy[0] = 1;

        for(int i = 1; i < arr.length; i++) {
            int max = 0;
            // 앞에 숫자
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + 1; // 현재 최대값은 앞의 값의 합
                result = Math.max(result, dy[i]);
            }
        }

        return result;
    }

/*
8
5 3 7 8 6 2 9 4
*/

    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(arr));

    }
}
