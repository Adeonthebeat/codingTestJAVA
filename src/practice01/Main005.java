package practice01;

import java.util.Scanner;

/**
 * [특정 문자 뒤집기]
 */
public class Main005 {

    public String solution(String str){
        String result = "";

        char[] x = str.toCharArray();

        int lt = 0, rt = str.length() - 1;

        while(lt < rt){
            // 알파벳 체크 - 알파벳이 아니라면, lt++
            if(!Character.isAlphabetic(x[lt])){
                lt++;
            } else if(!Character.isAlphabetic(x[rt])){ // 알파벳 체크 - 알파벳이 아니라면, rt--
                rt--;
            } else {
                char temp = x[lt];
                x[lt] = x[rt];
                x[rt] = temp;
                lt++;
                rt--;
            }
        }
        String temp = String.valueOf(x);
        result += temp;

        return result;
    }

    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));
    }

}
