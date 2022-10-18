package lecture04;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/** $$$
 * [K번째 큰 수] - TreeSet || 3중 for문
 */
public class Main05 {

    public int solution(int n, int k, int[] arr){

        // K번째 수가 존재하지 않으면, -1를 출력
        int result = -1;

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int l = j + 1; l < n; l++){
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : treeSet){
            cnt++;
            if(cnt == k){
                result = x;
            }
        }

        // TreeSet Method 정리
        // treeSet.add()
        // treeSet.remove(143);
        // treeSet.size()
        // treeSet.first() // 1번째 값
        // treeSet.last() // 1번째 값

        return result;
    }
/*
10 3
13 15 34 23 45 65 33 11 26 42
*/
    public static void main(String[] args) {
        Main05 main = new Main05();
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
