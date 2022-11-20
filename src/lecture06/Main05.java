package lecture06;

import java.util.*;

/** $
 * [중복 확인] - HashMap | arr[i] = arr[i+1]
 */
public class Main05 {

    public String solution(int n, int[] arr){

        String result = "U";

        Arrays.sort(arr);

        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i + 1]){
                return "D";
            }
        }

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int x : arr){
//            map.put(x, map.getOrDefault(x, 0) + 1);
//            if(map.get(x) > 1){
//                return 'D';
//            }
//        }


        return result;
    }

/**
8
20 25 52 30 39 33 43 33
*/


    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 작업의 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
