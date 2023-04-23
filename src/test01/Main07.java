package test01;

import java.util.Scanner;

/**
 * [회문 문자열]
 */
public class Main07 {

    public String solution(String str) {
        String result = "YES";

//        str = str.toLowerCase();
//
//        int len = str.length();
//
//        for(int i = 0; i < len / 2; i++) {
//            if(str.charAt(i) != str.charAt(len - 1 - i)) {
//                return result = "NO";
//            }
//        }

        String temp = new StringBuilder(str).reverse().toString();

        if(!str.equalsIgnoreCase(temp)) {
            return result = "NO";
        }

        return result;
    }
/*
gooG
*/
    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
