package practice02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [보이는 학생]
 */
public class Main002 {

    public int solution(int n, int[] arr){
        int result = 0, max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                result++;
                max = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
