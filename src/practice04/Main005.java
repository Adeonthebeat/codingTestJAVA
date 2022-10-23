package practice04;

import java.util.*;

/** $$$
 * [K번째 큰 수] - TreeSet || 3중 for문
 */
public class Main005 {

    public int solution(int n, int k, int[] arr){

        int result = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int m = j+1; m < n; m++){
                    treeSet.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }

        int cnt = 0;
        for(int x : treeSet){
            cnt++;
            if(cnt == 3){
                result = x;
            }
        }
        return result;
    }
/*
10 3
13 15 34 23 45 65 33 11 26 42
*/
    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
