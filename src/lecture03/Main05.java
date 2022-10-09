package lecture03;

import java.util.Scanner;

/** $$$
 * [연속된 자연수의 합] - (n/2 + n/2+1) = n | lt/rt ->> sliding window
 */
public class Main05 {


    public int solution(int n){
        int result = 0, sum = 0, lt = 0;

//        int m = n/2 + 1;        // (n/2 + n/2+1) = n
//        int[] arr = new int[m];
//
//        for(int i = 0; i < m; i++){
//            arr[i] = i + 1; // 0이 아닌 1부터
//        }
//
//        // 똑같음
//        for(int rt = 0; rt < m; rt++){
//            sum += arr[rt];
//            if(sum == n){
//                result++;
//            }
//
//            while(sum >= n){
//                sum -= arr[lt++];
//                if(sum == n){
//                    result++;
//                }
//            }
//        }

        /*
         * [수학적 방법]
         * 1 2 -> 15 - 3 = 12 /2(개수) -->> 1+6 + 2+6 = 15
         * 1 2 3 -> 15 - 6 = 9/3(개수) -->> 1+3 + 2+3 + 3+3= 15
         * 1 2 3 4 5 -> 15 -15 = 0
         */
        int cnt = 1;
        n--; // 14
        while(n > 0){
            cnt++; // 자릿수 -> 2
            n = n - cnt; // 15 - 3
            if(n % cnt == 0){ // 12 % 2 == 0?
                System.out.println(n + "  " + cnt);
                result++;
            }
        }


        return result;
    }

/**
15
*/

    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(main.solution(n));

    }

}
