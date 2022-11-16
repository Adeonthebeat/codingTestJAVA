package lecture06;

import java.util.Scanner;

/**
 * [삽입 정렬] - 2중 for문 | i = 1 | -1 | break | arr[j+1] = temp
 */
public class Main03 {

    public int[] solution(int n, int[] arr){

        for(int i = 1; i < n; i++){
            int temp = arr[i], j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > temp) {
                    // 뒤로!
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }

        return arr;
    }

/**
6
13 5 11 7 23 15
*/


    public static void main(String[] args) {
        Main03 main = new Main03();
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
