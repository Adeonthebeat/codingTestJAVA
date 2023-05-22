package test03;

import java.util.Scanner;

/**
 * [연속된 자연수의 합]
 */
public class Main05 {

    public int solutionMath(int n) {
        int result = 0;

        int cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n- cnt;
            if(n % cnt == 0) {
                System.out.println(n +" "+ cnt);
                result++;
            }
        }

        return result;
    }

    public int solution(int n) {
        int result = 0, sum = 0, lt = 0;

        int m = n / 2 + 1;

        int[] arr = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if(sum == n) {
                result++;
            }

            while(sum >= n) {
                sum -= arr[lt++];

                if(sum == n) {
                    result++;
                }
            }
        }

        return result;
    }
/*
15
*/
    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(main.solution(n));

    }

}
