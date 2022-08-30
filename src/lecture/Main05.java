package lecture;

import java.util.Scanner;

public class Main05 {

    /**
     * 특수 문자 뒤집기
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "";
        char[] charArray = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt){
            // 특수문자 체크
            if(!Character.isAlphabetic(charArray[lt])){
                lt++;
            } else if(!Character.isAlphabetic(charArray[rt])){
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
        ret += temp;

        return ret;
    };

    // a#b!GE*T@S
    public static void main(String[] args) {
        Main05 main = new Main05();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));

    }
}