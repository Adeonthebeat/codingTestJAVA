package practice01_String;

import java.util.Scanner;

/**
 * [문장 속 단어]
 */
public class Main003 {

    public String solution(String str) {
        String result = "";

//        int min = Integer.MIN_VALUE;
//        String[] strList = str.split(" ");
//        for(int i = 0; i < strList.length; i++){
//            int len = strList[i].length();
//            if(len > min){
//                min = len;
//                result = strList[i];
//            }
//        }

        int min = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){ // 중요
            String temp = str.substring(0, pos); // 중요
            int len = temp.length();
            if(len > min){
                min = len;
                result = temp;
            }
            str = str.substring(pos + 1); // 중요
            if(str.length() > min){ // 중요
                result = str;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Main003 main = new Main003();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));

    }
}
