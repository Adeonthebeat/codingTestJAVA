package practice06;

import java.util.Scanner;

/** $
 * [중복 확인] - 1중 for문
 */
public class Main005 {

    public String solution(int n, int[] arr){

        String result = "U";

        for(int i = 0; i < n - 1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }
        return result;
    }

/**
8
20 25 52 30 39 33 43 33
*/

    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }

}
