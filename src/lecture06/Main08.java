package lecture06;

import java.util.*;

/** $$$
 * [이분검색] -  mid = (lt + rt) / 2
 */
public class Main08 {

    public int solution(int n, int k, int[] arr){

        int result = 0;

        // 정렬
        Arrays.sort(arr);

        int lt = 0, rt = n-1;

        // 이분 정렬
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(arr[mid] == k){
                result = mid + 1;
                break;
            }

            // 큰 값 다 날리기
            if(arr[mid] > k){
                rt = mid - 1;
            }
            // 작은 값 다 날리기
            else {
                lt = mid + 1;
            }
        }
        return result;
    }

    /**
     8 32
     23 87 65 12 57 32 99 81
     */


    public static void main(String[] args) {
        Main08 main = new Main08();
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
