package practice01_String;

import java.util.Scanner;

/**
 * [암호] - substring / 이진수(Integer.parseInt(temp, 2))
 */
public class Main012 {

    public String solution(int cnt, String str){
        String result = "";

        for(int i = 0; i < str.length() - 1; i++){
            // substring replaceAll
            String temp = str.substring(0, 7).replace("#", "1").replace("*", "0");

            // 이진수화
            int ret = Integer.parseInt(temp, 2);

            // add
            result += (char) ret;

            str = str.substring(7);
        }
        return result;
    }


    public static void main(String[] args) {
        Main012 main = new Main012();
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        String str = input.next();
        System.out.println(main.solution(cnt, str));
    }

}
