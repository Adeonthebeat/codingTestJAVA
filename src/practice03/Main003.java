package practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * [최대 매출] - sliding window((arr[i] - arr[i-k]))
 */
public class Main003 {

    public int solution(int n, int k, int[] arr){
        int result = 0, sum = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        result = sum;

        for(int i = k; i < n; i++){
            sum += (arr[i] -  arr[i-k]);
            result = Math.max(result, sum);
        }

        return result;
    }
/**
10 3
12 15 11 20 25 10 20 19 13 15
*/
    public static void main(String[] args) {
        Main003 main = new Main003();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
