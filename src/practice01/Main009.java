package practice01;

import java.util.Scanner;

/**
 * [숫자만 추출] - isDigit // ASCII Code
 */
public class Main009 {

    public int solution(String str){
        String ret = "";
        int result = 0;
//        for(char x : str.toCharArray()){
//            if(Character.isDigit(x)){
//                ret += x;
//            }
//        }
//        result = Integer.valueOf(ret);

        // 아스키 코드로 찾기. 48 ~ 57 -> 숫자
        for(char x : str.toCharArray()){
            if(x >= 48 && x <= 57){
                result = result * 10 + (x - 48);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main009 main = new Main009();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));
    }

}
