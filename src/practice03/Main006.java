package practice03;

import java.util.Scanner;

/** $$$
 * [최대 길이 연속부분수열] - cnt > k || rt - lt + 1
 */
public class Main006 {

    public int solution(int n, int k,int[] arr){
        int result = 0, cnt = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0){
                cnt++;
            }

            // cnt > k ->> 바꾸려는 수보다 바뀐게 많다면,
            while(cnt > k){
                if(arr[lt] == 0){
                    cnt--;
                }
                lt++;
            }
            result = Math.max(result, rt - lt + 1); // 중요!!
        }

        return result;
    }
/**
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
*/
    public static void main(String[] args) {
        Main006 main = new Main006();
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
