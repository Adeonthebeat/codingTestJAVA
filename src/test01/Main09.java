package test01;

import java.util.Scanner;
/**
 * [숫자만 추출
 */
public class Main09 {

    public int solution(String str) {
        String result = "";

        for(char x : str.toCharArray()) {
//            if(Character.isDigit(x)) {
//                result += x;
//            }

            /*================================
            // 65 ~ 90  : 대문자
            // 97 ~ 122 : 소문자
            // 48 ~ 57  : 숫자
            ================================*/
            if(x >= 48 && x <= 57) {
                result += x;
            }

        }

        int ret = Integer.parseInt(result);

        return ret;
    }
/*
g0en2T0s8eSoft
*/
    public static void main(String[] args) {
        Main09 main = new Main09();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }
}
