package lecture01_String;

import java.util.*;

public class Main03 {

    /**
     * 문장 속 단어
     * @param str it is time to study
     * @return
     */
    public String solution(String str){
        String ret = "";
        String[] strList = str.split(" ");
        //int min = Integer.MIN_VALUE;
//        for(String x : strList){
//            int len = x.length();
//            if(len > min){
//                min = len;
//                ret = x;
//            }
//        }
        int min = Integer.MIN_VALUE, pos;
        // 발견하지 못한다면.
        while ((pos=str.indexOf(' ')) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len > min){
                min = len;
                ret = temp;
            }
            str = str.substring(pos+1);
        }
        // 마지막 공백 이후에 단어 캐치.
        if(str.length() > min){
            ret = str;
        }
        return ret;
    };

    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));
    }
}