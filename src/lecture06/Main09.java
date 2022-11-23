package lecture06;

import java.util.*;

/** $$$$
 * [뮤직비디오(결정알고리즘)] - 이분검색 | 최소값 찾기 | mid = (lt + rt) / 2 | stream(arr).max().getAsInt()
 */
public class Main09 {

    /**
     * 용량 카운트(몇 장 필요하다를 리턴)
     * @param arr
     * @param capacity
     * @return
     */
    public int count(int[] arr, int capacity){

        int cnt = 1;    // DVD 개수는 1장이상
        int sum = 0;    // DVD에 담아내는 곡의 합

        for(int x : arr){
            // 용량보다 크다면.
            if((sum+x) > capacity){
                cnt++;
                sum = x;
            }
            // 용량보다 작다면, 누적덧셈
            else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int n, int k, int[] arr){

        int result = 0;

        // 최소용량 = max(arr) | 최대용량 = sum(arr)
        int lt = Arrays.stream(arr).max().getAsInt();   // 최소용량 = max(arr)
        int rt = Arrays.stream(arr).sum();              // 최대용량 = sum(arr)

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= k){
                result = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return result;
    }

    /**
     9 3
     1 2 3 4 5 6 7 8 9
     */


    public static void main(String[] args) {
        Main09 main = new Main09();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 모든 노래
        int k = input.nextInt(); // 가능한 Target
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
