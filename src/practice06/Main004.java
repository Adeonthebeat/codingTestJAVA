package practice06;

import java.util.Scanner;

/** $$$$$
 * [Least Recently Used] -
 */
public class Main004 {

    public int[] solution(int size, int n, int[] arr){

        int[] cache = new int[size];

        for(int x : arr){
            int pos = -1;

            for(int i = 0; i < size; i++){
                // Cache Hit Check
                if(x == cache[i]){
                    pos = i;
                }
            }

            // Cache Miss
            if(pos == -1){
                for(int i = size - 1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            // Cache Hit
            else {
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            // 첫번째 자리
            cache[0] = x;
        }


        return cache;
    }

/**
5 9
1 2 3 2 6 2 3 5 7
*/

    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        int size = input.nextInt(); // Cache size
        int n = input.nextInt();    // 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(size, n, arr)){
            System.out.print(x + " ");
        }


    }

}
