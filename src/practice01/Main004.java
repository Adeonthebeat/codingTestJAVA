package practice01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [단어 뒤집기]
 */
public class Main004 {

//    public String solution(String str){
//        String result = "";
//
//        for(int i = str.length() -1; i >= 0; i--){
//            result += str.charAt(i);
//        }
//
//        return result;
//    }

    public ArrayList<String> solution(int tot, String[] str){
        ArrayList<String> result = new ArrayList<String>();

//        for(String x : str){
//            String temp = new StringBuilder(x).reverse().toString();
//            result.add(temp);
//        }

        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;

            while(lt < rt){
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(s);
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();

//        for(int i = 0; i < cnt; i++){
//            String str = input.next();
//            System.out.println(main.solution(str));
//        }
        String[] strList = new String[cnt];
        for(int i = 0; i < cnt; i++){
            strList[i] = input.next();
        }

        for(String x : main.solution(cnt, strList)){
            System.out.println(x);
        }
    }

}
