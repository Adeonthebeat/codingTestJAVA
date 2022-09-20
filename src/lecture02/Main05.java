package lecture02;

import java.util.Scanner;

/**
 * [소수(에라토스테네스 체)] - 배수를 찾아라!
 */
public class Main05 {

    public int solution(int n){
        int result = 0;
        int[] ch = new int[n+1]; // 20까지

        for(int i = 2; i <= n; i++){
            if(ch[i] == 0){
                result++;
                for(int j = i; j <= n; j=j+i){ // j = j+i <-- 배수 찾기
                    ch[j] = 1;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(main.solution(n));
    }

}
