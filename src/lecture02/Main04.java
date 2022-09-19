package lecture02;

import java.util.Scanner;

/**
 * [피보나치 수열] -
 */
public class Main04 {

    public int[] solution(int n){
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        int ret = 0;
        for(int i = 2; i < n; i++){
            ret = result[i-2] + result[i-1];
            result[i] = ret;
        }
//        int a = 1, b = 1, c = 0;
//        for(int i = 2; i < n; i++){
//            c = a+b;
//            System.out.println(c + " ");
//            a = b;
//            b = c;
//        }

        return result;
    }


    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] result = main.solution(n);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] +" ");
        }

    }

}
