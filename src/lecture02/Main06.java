package lecture02;

import java.util.ArrayList;
import java.util.Scanner;

/** $$
 * [뒤집은 소수] - 공식(res * 10 + t)
 */
public class Main06 {

    public boolean isPrime(int num){
        if(num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] ch){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int temp = ch[i];
            int res = 0;
            while(temp > 0){
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if(isPrime(res)){
                result.add(res);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] ch = new int[n];

        for(int i = 0; i < n; i++){
            ch[i] = input.nextInt();
        }

        for(int x : main.solution(n, ch)){
            System.out.print(x + " ");
        }
    }

}
