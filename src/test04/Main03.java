package test04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * [매출액의 종류]
 */
public class Main03 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for(int i = 0; i < k-1; i++) {
            resultMap.put(arr[i], resultMap.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = k-1; rt < n; rt++) {
            resultMap.put(arr[rt], resultMap.getOrDefault(arr[rt], 0) + 1);

            result.add(resultMap.size());

            resultMap.put(arr[lt], resultMap.getOrDefault(arr[lt], 0) - 1);

            if(resultMap.get(arr[lt]) == 0) {
                resultMap.remove(arr[lt]);
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

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }
}
