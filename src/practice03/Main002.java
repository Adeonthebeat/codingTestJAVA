package practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * [공통원소 구하기] -
 */
public class Main002 {

    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB){
        ArrayList<Integer> result = new ArrayList<Integer>();

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m){
            if(arrA[p1] == arrB[p2]){
                result.add(arrA[p1++]);
                p2++;
            } else if(arrA[p1] < arrB[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        return result;
    }
/**
5
1 3 9 5 2
5
3 2 5 7 8
*/
    public static void main(String[] args) {
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arrA = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = input.nextInt();
        }

        int m = input.nextInt();
        int[] arrB = new int[m];

        for(int i = 0; i < m; i++){
            arrB[i] = input.nextInt();
        }

        for(int x : main.solution(n, arrA, m, arrB)){
            System.out.print(x + " ");
        }

    }
}
