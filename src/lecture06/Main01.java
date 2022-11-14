package lecture06;

import java.util.Scanner;

/**
 * [선택 정렬] - 2중 for문 | Swap(arr[i]) |
 */
public class Main01 {

    public int[] solution(int n, int[] arr){

        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }

    /**
     6
     13 5 11 7 23 15
     */


    public static void main(String[] args) {
        Main01 main = new Main01();
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
