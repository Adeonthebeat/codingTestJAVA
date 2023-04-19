package test01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [단어 뒤집기]
 */
public class Main04 {

    public String solution(String str) {

        String result = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public ArrayList<String> solution(int n, String[] strList) {
        ArrayList<String> result = new ArrayList<>();

        for(String x : strList) {
            String temp = new StringBuilder(x).reverse().toString();
            result.add(temp);
        }
        return result;
    }

    public ArrayList<String> solution(String[] strList) {
        ArrayList<String> result = new ArrayList<>();

        for(String x : strList) {
            char[] s = x.toCharArray();

            int lt = 0, rt = x.length() - 1;

            while(lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            result.add(tmp);
        }

        return result;
    }

/*
3
good
Time
Big
 */
    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

//        int n = input.nextInt();
//
//        for(int i = 0; i < n; i++) {
//            String str = input.next();
//            System.out.println(main.solution(str));
//        }

        int n = input.nextInt();

        String[] strList = new String[n];

        for(int i = 0; i < n; i++) {
            strList[i] = input.next();
        }

        for(String x : main.solution(n, strList)) {
            System.out.println(x);
        }

        for(String x : main.solution(strList)) {
            System.out.println(x);
        }


    }
}
