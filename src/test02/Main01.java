package test02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [큰 수 출력하기]
 */
public class Main01 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(0, arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i-1] < arr[i]) {
                result.add(arr[i]);
            }
        }

        return result;
    }
/*
6
7 3 9 5 6 12
*/
    public static void main(String[] args) {
        Main01 main = new Main01();
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
