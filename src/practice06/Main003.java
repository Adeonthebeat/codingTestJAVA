package practice06;

import java.util.Scanner;

/** $$$$
 * [삽입정렬] -  2중 for문 | 거꾸로 | arr[j+1] = arr[j] | arr[j+1] = temp;
 */
public class Main003 {

    public int[] solution(int n, int[] arr){

        for(int i = 1; i < n; i++){
            int temp = arr[i], j;

            // 거꾸로
            for(j = i-1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                } else {
                    // 앞에 있는 것보다 크다면, break
                    break;
                }
            }
            // 앞에 있는 부분 삽입
            arr[j+1] = temp;
        }

        return arr;
    }

/**
6
11 7 5 6 10 9
*/

    public static void main(String[] args) {
        Main003 main = new Main003();
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
