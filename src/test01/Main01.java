package test01;

import java.util.*;

/**
 * [문자 찾기]
 */
public class Main01 {

    public int solution(String str, char t) {
        int result = 0;

        for(char x : str.toCharArray()) {
            if(Character.toString(x).equalsIgnoreCase(Character.toString(t))) {
                result++;
            }
        }

        return result;
    }

/*
Computercooler
c
*/
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        char t = input.next().charAt(0);

        System.out.println(main.solution(str, t));

    }
}
