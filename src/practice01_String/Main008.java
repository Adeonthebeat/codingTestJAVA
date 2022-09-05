package practice01_String;

import java.util.Scanner;

/**
 * [유효한 팰린드롬] - replaceAll
 */
public class Main008 {

    public String solution(String str){
        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if (str.equals(temp)) {
            result = "YES";
        }

        return result;
    }

    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));
    }

}
