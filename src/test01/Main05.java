package test01;

import java.util.Scanner;
/**
 * [특정 문자 뒤집기]
 */
public class Main05 {

    public String solution(String str) {
        String result = "";

        char[] charArray = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt) {

            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        String temp = String.valueOf(charArray);
        result += temp;

        return result;
    }

/*
a#b!GE*T@S
*/
    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);

        String str = input.next();

        System.out.println(main.solution(str));

    }

}
