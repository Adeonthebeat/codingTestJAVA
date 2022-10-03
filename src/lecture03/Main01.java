package lecture03;

import java.util.*;

/** $
 * [두 배열 합치기] - result.add(arrA[p1++]);
 */
public class Main01 {


    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB){
        ArrayList<Integer> result = new ArrayList<Integer>();

        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m){
            if(arrA[p1] < arrB[p2]){
                result.add(arrA[p1++]);
            } else {
                result.add(arrB[p2++]);
            }
        }

        while(p1 < n){
            result.add(arrA[p1++]);
        }
        while(p2 < m){
            result.add(arrB[p2++]);
        }

        return result;
    }

/**
3
1 3 5
5
2 3 6 7 9
*/

    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arrA = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = input.nextInt();
        }

        int m = input.nextInt();
        int[] arrB = new int[m];

        for(int j = 0; j < m; j++){
            arrB[j] = input.nextInt();
        }

        for(int x : main.solution(n, arrA, m, arrB)){
            System.out.print(x + " ");
        }

    }

}
