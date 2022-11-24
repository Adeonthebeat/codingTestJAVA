package lecture06;

import java.util.Arrays;
import java.util.Scanner;

/** $$$$$
 * [마구간 정하기(결정알고리즘)] - 이분검색 | 최대값 찾기 | Target값을 몇마리로 배치할 수 있는지 | mid = (lt + rt) / 2 | stream(arr).max().getAsInt()
 */
public class Main10 {

    public int count(int[] arr, int distance){
        int cnt = 1;
        int endPoint = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - endPoint >= distance){
                cnt++;
                endPoint = arr[i];
            }
        }

        return cnt;
    }

    public int solution(int n, int k, int[] arr){

        int result = 0;

        Arrays.sort(arr);

        // 두 말의 최소 거리 = 1 | 두 말의 거리는 최대값
        int lt = 1;         // 최소값
        int rt = arr[n-1];  // 최대값

        // 두 말의 최대 거리를 두고 말을 카운트
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= k){
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
        Main10 main = new Main10();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 마굿간의 좌표
        int k = input.nextInt(); // 가능한 말의 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
