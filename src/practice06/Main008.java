package practice06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** $$$$
 * [이분검색] - lt, rt | mid | 날리기
 */
public class Main008 {

    public int solution(int n, int target, int[] arr){

        int result = 0;

        Arrays.sort(arr);

        int lt = 0, rt = n - 1;

        while(lt <= rt){

            int mid = (lt + rt) / 2;

            if(arr[mid] == target){
                result = mid + 1;
                break;
            }

            // 큰 값 다 날리기
            if(arr[mid] > target){
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
        Main008 main = new Main008();
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
