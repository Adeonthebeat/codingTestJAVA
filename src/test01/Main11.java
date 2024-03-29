package test01;

import java.util.Scanner;

/**
 * [문자열 압축]
 */
public class Main11 {

    public String solution(String str) {
        String result = "";

        // 늘리는 작업
        str = str + " ";
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++) {

            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                result += str.charAt(i);

                if(cnt > 1) {
                    result += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return result;
    }

    // KKHSSSSSSSE ->> K2HS7E
    // KSTTTSEEKFKKKDJJGG ->> KST3SE2KFK3DJ2G2
    public static void main(String[] args) {
        Main11 main = new Main11();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
