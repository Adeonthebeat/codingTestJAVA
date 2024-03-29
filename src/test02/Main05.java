package test02;

import java.util.Scanner;

/**
 * [소수(에라토스테네스 체)]
 */
public class Main05 {

    public int solution(int n) {
        int result = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                result++;
                for(int j = i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return result;
    }
    /*
    20
    */
    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(main.solution(n));

    }

}
