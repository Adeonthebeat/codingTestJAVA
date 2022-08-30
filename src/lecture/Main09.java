package lecture;

import java.util.Scanner;

public class Main09 {

    /**
     * 숫자만 추출
     * @param str
     * @return
     */
    public int solution(String str){
        String ret = "";
        int result = 0;
        for(char rs : str.toCharArray()){
            // 아스키 코드로 찾기. 48 ~ 57 -> 숫자
            if(rs >= 48 && rs <= 57){
                result = result * 10 + (rs - 48);
            }
        }
//        for(char rs : str.toCharArray()){
//            if(Character.isDigit(rs)){
//                ret += rs;
//            }
//        }
//        return Integer.parseInt(ret);

        return result;
    };
    // g0en2T0s8eSoft
    public static void main(String[] args) {
        Main09 main = new Main09();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));

    }
}