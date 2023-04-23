package test01;

import java.util.Scanner;

/**
 * [중복문자제거]
 */
public class Main06 {

    public String solution(String str) {

        String result = "";

//        for(char x : str.toCharArray()) {
//            if(!result.contains(String.valueOf(x))) {
//                result += x;
//            }
//        }

        for(int i = 0; i < str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        return result;
    }
/*
ksekkset
*/
    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
