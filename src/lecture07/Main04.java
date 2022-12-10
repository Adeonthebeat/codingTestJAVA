package lecture07;

import java.util.Scanner;

/** $$$$
 * [피보나치 수열] - fibo[n] > 0 | for문 > Stack => Stack Frame이 많이 생김
 */
public class Main04 {

    // 저장하는 배열
    static int[] fibo;

    public int DFS(int n){

        // 가장 중요함!
        if(fibo[n] > 0){
            return fibo[n];
        }

        if(n == 1){
            return fibo[n] = 1;
        } else if(n == 2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }

    }
/**
10
*/
    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        int n = 45;
//        for(int i = 1; i < n; i++){
//            System.out.print(main.DFS(i) + " ");
//        }
        fibo = new int[n+1];
        main.DFS(n);
        for(int i = 1; i < n; i++){
            System.out.print(fibo[i] + " ");
        }


    }
}
