package practice02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [큰 수 출력하기]
 */
public class Main001 {

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0, arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(n, arr)){
            System.out.print(x + " ");
        }

    }
}
