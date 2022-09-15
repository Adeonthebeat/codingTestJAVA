package practice01;

import java.util.Scanner;

/**
 * [문자열 압축] - 끊어 낸다는 느낌 (str.charAt(i) == str.charAt(i+1))
 */
public class Main011 {

    public String solution(String str){
        String result = "";
        str = str + " ";
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                cnt++;
            } else {
                result += str.charAt(i);

                if(cnt > 1){
                    result += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main011 main = new Main011();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));
    }

}
