package lecture01_String;

import java.util.Scanner;

public class Main02 {

    /**
     * 대소문자 변환
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "";
        for(char x : str.toCharArray()){

            // 소문자 - 대문자 = 32
            // 대문자 65 ~ 90
            if(x >= 65 && x <= 90){
                ret += (char)(x + 32);
            }
            // 소문자 97 ~ 122
            else {
                ret += (char)(x - 32);
            }
//            if(Character.isUpperCase(x)){
//                ret += Character.toLowerCase(x);
//            } else {
//                ret += Character.toUpperCase(x);
//            }
        }
        return ret;
    };

    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));
    }
}