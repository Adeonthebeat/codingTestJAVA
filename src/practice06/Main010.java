package practice06;

import java.util.Arrays;
import java.util.Scanner;

/** $$$$$
 * [마구간 정하기(결정알고리즘)] - count Method | endPoint | 거리가 멀면 lt = mid + 1
 */
public class Main010 {

    /**
     * 말의 마리 수를 구하는 함수
     * @param arr
     * @param distance
     * @return
     */
    public int count(int[] arr, int distance){

        int cnt = 1;    // 말의 마리 수
        int endPoint = arr[0];

        for(int i = 1; i < arr.length; i++){
            if((arr[i] - endPoint) >= distance){
                cnt++;
                endPoint = arr[i];
            }
        }

        return cnt;
    }


    public int solution(int n, int distnace, int[] arr){

        int result = 0;

        Arrays.sort(arr);

        // 두 말의 최소 거리 = 1 | 두 말의 거리는 최대값
        int lt = 1;         // 최소값
        int rt = arr[n-1];  // 최대값

        // 두 말의 최대 거리를 두고 말을 카운트
        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(count(arr, mid) >= distnace){
                result = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return result;
    }

    /**
     5 3
     1 2 8 4 9
     */

    public static void main(String[] args) {
        Main010 main = new Main010();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // 개수
        int target = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, target, arr));

    }

}
