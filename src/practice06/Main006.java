package practice06;

import java.util.*;

/** $$
 * [장난꾸러기] - 정렬
 */
public class Main006 {

    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList<Integer> result = new ArrayList<>();

        int[] temp = arr.clone();
        Arrays.sort(temp);

        for(int i = 0; i < n; i++){
            if(arr[i] != temp[i]){
                result.add(i+1);
            }
        }

        return result;
    }

/**
9
120 125 152 130 135 135 143 127 160
*/

    public static void main(String[] args) {
        Main006 main = new Main006();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)){
            System.out.print(x + " ");
        }

    }

}
