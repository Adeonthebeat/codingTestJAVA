package lecture06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * [장난꾸러기] - 정렬
 */
public class Main06 {

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
->> 3 8
6
120 130 150 150 130 150
->> 3 5
*/


    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 작업의 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)){
            System.out.print(x + " ");
        }

    }
}
