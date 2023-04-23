package test01;

import java.util.Scanner;

/**
 * [유효한 팰린드롬]
 */
public class Main08 {

    public String solution(String str) {
        String result = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String temp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(temp)) {
            return "YES";
        }

        return result;
    }
/*
found7, time: study; Yduts; emit, 7Dnuof
*/
    public static void main(String[] args) {
        Main08 main = new Main08();
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(main.solution(str));

    }

}
