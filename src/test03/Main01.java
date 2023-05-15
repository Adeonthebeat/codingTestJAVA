package test03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [두 배열 합치기]
 */
public class Main01 {

    public ArrayList<Integer> solution(int a, int[] arrA, int b, int[] arrB) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while(p1 < a && p2 < b) {
            if(arrA[p1] < arrB[p2]) {
                result.add(arrA[p1++]);
            } else {
                result.add(arrB[p2++]);
            }
        }

        while(p1 < a) {
            result.add(arrA[p1++]);
        }

        while(p2 < b) {
            result.add(arrB[p2++]);
        }

        return result;
    }
/*
3
1 3 5
5
2 3 6 7 9
*/
    public static void main(String[] args) {
        Main01 main = new Main01();
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
