package practice01_String;

import java.util.Scanner;

/**
 * [중복문자제거] - indexOf
 */
public class Main006 {

    public String solution(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main006 main = new Main006();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));
    }

}
