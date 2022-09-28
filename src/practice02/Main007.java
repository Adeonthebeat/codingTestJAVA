package practice02;

import java.util.ArrayList;
import java.util.Scanner;

/** $$
 * [점수계산] - 공식(res * 10 + t)
 */
public class Main007 {

    public int solution(int n, int[] arr){
        int result = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt++;
                result+= cnt;
            } else {
                cnt = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main007 main = new Main007();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
