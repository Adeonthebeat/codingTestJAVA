package lecture07;

import java.util.Scanner;

/** $$$
 * [재귀함수] - Stack Frame | 잠시 대기
 */
public class Main01 {

    public void solution(int n){

        if(n == 0){
            return;
        } else {
            // Stack Frame
            // System.out.print(n + " "); // 3 2 1
            solution(n-1);
            System.out.print(n + " "); // 1 2 3
        }

    }
/**
 * 3
 */
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        main.solution(input.nextInt());

    }
}
