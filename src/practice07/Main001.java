package practice07;

import java.util.*;

/**
 * [재귀함수]
 */
public class Main001 {

    public void solution(int n) {

        if(n == 0){
            return;
        } else {
//            System.out.print(n + " "); // 3 2 1
            solution(n-1);
            System.out.print(n + " "); // 1 2 3
        }

    }

    public static void main(String[] args) {
        Main001 main = new Main001();

        int n = 3;

        main.solution(n);

    }
}
