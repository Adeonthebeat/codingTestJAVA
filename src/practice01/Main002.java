package practice01;
import java.util.Scanner;
/**
 * [대소문자 변환]
 */
public class Main002 {

    public String solution(String str){
        String result = "";

        for(char x : str.toCharArray()){
//            if(Character.isUpperCase(x)){
//                result += Character.toLowerCase(x);
//            } else {
//                result += Character.toUpperCase(x);
//            }
            // 대문자 65 ~ 90 (+)
            if(x >= 65 && x <= 90){
                result += (char) (x + 32);
            }
            // 소문자 97 ~ 122 (-)
            else {
                result += (char) (x - 32);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));
    }

}
