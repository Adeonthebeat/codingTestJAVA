package test02;

import java.util.Scanner;

/**
 * [보이는 학생]
 */
public class Main02 {

    public int solution(int n, int[] arr) {
        int result = 1;

        int max = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                result++;
                max = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }

}
