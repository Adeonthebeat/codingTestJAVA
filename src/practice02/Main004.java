package practice02;

import java.util.Scanner;

/** $
 * [피보나치 수열]
 */
public class Main004 {

    public int[] solution(int n){
        int[] result = new int[n];

        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < n; i++){
            result[i] = result[i-2] + result[i-1];
        }

        return result;
    }

    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int x: main.solution(n)){
            System.out.print(x + " ");
        }

    }
}
