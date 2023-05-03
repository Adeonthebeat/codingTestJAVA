package test02;

import java.util.Scanner;

/**
 * [등수구하기]
 */
public class Main08 {

    public int[] solution(int n, int[] arr) {
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            int grade = 1;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    grade++;
                }
            }
            result[i] = grade;
        }

        return result;
    }
/*
5
87 89 92 100 76
*/
    public static void main(String[] args) {
        Main08 main = new Main08();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }

}
