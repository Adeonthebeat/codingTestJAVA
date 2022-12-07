package lecture07;

import java.util.Scanner;

/** $$$$
 * [재귀함수를 이용한 이진수 출력] - Stack Frame | 잠시 대기 | 위부터 Pop
 */
public class Main02 {

    public void solution(int n){

        if(n == 0){
            return;
        } else {
            // System.out.print(n + " "); 몫
            solution(n/2);
            System.out.print(n%2 + " "); // 나머지
        }

    }
/**
11
*/
    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        main.solution(input.nextInt());

    }
}
