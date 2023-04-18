package test01;

import java.util.*;

/**
 * [대소문자 변환]
 */
public class Main02 {


    public String solution(String str) {
        String result = "";

        /*===============================
        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                result += Character.toLowerCase(x);
            } else {
                result += Character.toUpperCase(x);
            }
        }
        ===============================*/
        /*===============================
            소문자 - 대문자 = 32
            대문자 65 ~ 90
            소문자 97 ~ 122
        ===============================*/
        for(char x : str.toCharArray()) {
            if(x >= 65 && x <= 90) {
                result += (char)(x + 32);
            } else {
                result += (char)(x - 32);
            }
        }

        return result;
    }

/*
StuDY
*/

    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
