package practice07;

import java.util.Scanner;

/**
 * [재귀함수를 이용한 이진수 출력] - n/2 | n%2 |뒤에사부터
 */
public class Main002 {

    public void solution(int n) {

        if(n == 0){
            return;
        } else {
            solution(n/2);
            n = n%2;
            System.out.print(n); // 뒤에서부터
        }

    }

    public static void main(String[] args) {
        Main002 main = new Main002();

        int n = 11;

        main.solution(n);

    }
}
