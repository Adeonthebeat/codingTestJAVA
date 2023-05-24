package test03;

import java.util.Scanner;

public class Main06 {

    public int solution(int n, int k, int[] arr) {
        int result = 0, lt = 0, cnt = 0;

        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }

            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            result = Math.max(result, rt - lt + 1);
        }

        return result;
    }
    /*
    14 2
    1 1 0 0 1 1 0 1 1 0 1 1 0 1
    */
    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));

    }
}
