package lecture03;

import java.util.Scanner;

/** $$
 * [최대 길이 연속부분수열] - cnt > k || rt - lt + 1
 */
public class Main06 {


    public int solution(int n, int k, int[] arr){
        int result = 0, cnt = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0){ // rt = 0이라면, cnt++
                cnt++;
            }
            while(cnt > k){ // 한줄씩 밀리면서
                if(arr[lt] == 0){ // lt == 0 ->> cnt--
                    cnt--;
                }
                lt++; // lt는 밀리면서 증가.
            }
            result = Math.max(result, rt - lt + 1); // 해당 위치가 가장 큰 값인지?
        }

        return result;
    }

/**
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
*/

    public static void main(String[] args) {
        Main06 main = new Main06();
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
