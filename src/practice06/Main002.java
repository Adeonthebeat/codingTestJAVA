package practice06;

import java.util.Scanner;

/** $$$$
 * [버블정랼] -  2중 for문 | n-i-1
 */
public class Main002 {

    public int[] solution(int n, int[] arr){

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

/**
6
13 5 11 7 23 15
*/

    public static void main(String[] args) {
        Main002 main = new Main002();
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
