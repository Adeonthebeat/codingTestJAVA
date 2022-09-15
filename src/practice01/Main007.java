package practice01;

import java.util.Scanner;

/**
 * [회문 문자열] - StringBuilder
 */
public class Main007 {

    public String solution(String str){
        String result = "NO";
//        String temp = new StringBuilder(str.toUpperCase()).reverse().toString();
//        if(temp.equals(str.toUpperCase())){
//            result = "YES";
//        }

        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) == str.charAt(len - 1 - i)){
                result = "YES";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main007 main = new Main007();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));
    }

}
