package test02;

import java.util.Scanner;

/**
 * [점수계산] - 누적
 */
public class Main07 {

    public int solution(int n, int[] arr) {
        int result = 0;

        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                cnt++;
                result += cnt;
            } else {
                cnt = 0;
            }
        }

        return result;
    }

    /*
    10
    1 0 1 1 1 0 0 1 1 0
    */
    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
