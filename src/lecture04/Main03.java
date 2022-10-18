package lecture04;

import java.util.*;

/** $$
 * [매출액의 종류] - Two Pointer(lt, rt) || sliding Window || hashMap.size() || hashMap == 0 빼기
 */
public class Main03 {

    public ArrayList<Integer> solution(int n, int k, int[] arr){

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        // k일 전날까지 세팅
        for(int i = 0; i < k-1; i++){
            resultMap.put(arr[i], resultMap.getOrDefault(arr[i], 0) + 1);
        }

        // Two Pointer
        int lt = 0;
        for(int rt = k-1; rt < n; rt++){
            resultMap.put(arr[rt], resultMap.getOrDefault(arr[rt], 0) + 1);
            result.add(resultMap.size());

            // lt--;
            resultMap.put(arr[lt], resultMap.get(arr[lt]) - 1);

            if(resultMap.get(arr[lt]) == 0){
                resultMap.remove(arr[lt]); // 빈값이라면, key 삭제
            }
            lt++;
        }


        return result;
    }
/*
7 4
20 12 20 10 23 17 10
*/
    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, k, arr)){
            System.out.print(x + " ");
        }
    }
}
