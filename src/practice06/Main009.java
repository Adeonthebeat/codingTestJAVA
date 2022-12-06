package practice06;

import java.util.Arrays;
import java.util.Scanner;

/** $$$$$
 * [뮤직비디오(결정알고리즘)] - count Method |
 */
public class Main009 {

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

            if((sum + x) > capacity){
                cnt++;
                sum = x;
            } else {
                sum += x;
            }

        }
        return cnt;
    }
    public int solution(int n, int target, int[] arr){

        int result = 0;

        // 최소용량 = max(arr) | 최대용량 = sum(arr)
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){

            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= target){
                result = mid; // 용량을 채운 디스크
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
        Main009 main = new Main009();
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
