package practice02;

import java.util.Scanner;

/** $
 * [등수구하기] - 이중 for
 */
public class Main008 {

    public int[] solution(int n, int[] arr){
        int[] result = new int[n];

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
           int cnt = 1;
           for(int j = 0; j < n; j++){
               if(arr[j] > arr[i]){
                   cnt++;
               }
               result[i] = cnt;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
