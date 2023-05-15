package test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * [공통원소 구하기]
 */
public class Main02 {

    public ArrayList<Integer> solution(int a, int[] arrA, int b, int[] arrB) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int p1 = 0, p2 = 0;

        while(p1 < a && p2 < b) {
            if(arrA[p1] == arrB[p2]) {
                result.add(arrA[p1++]);
            } else if(arrA[p1] < arrB[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return result;
    }

/*
5
1 3 9 5 2
5
3 2 5 7 8
*/
    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] arrA = new int[a];

        for(int i = 0; i < a; i++) {
            arrA[i] = input.nextInt();
        }

        int b = input.nextInt();
        int[] arrB = new int[b];

        for(int i = 0; i < b; i++) {
            arrB[i] = input.nextInt();
        }

        for(int x : main.solution(a, arrA, b, arrB)) {
            System.out.print(x + " ");
        }

    }

}
