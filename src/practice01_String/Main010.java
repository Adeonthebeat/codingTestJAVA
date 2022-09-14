package practice01_String;

import java.util.Scanner;

/**
 * [가장 짧은 문자] - isDigit // ASCII Code
 */
public class Main010 {

    public int[] solution(String str, char target){
        int[] result = new int[str.length()];
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }
        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main010 main = new Main010();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char target = input.next().charAt(0);
        for(int x: main.solution(str, target)){
            System.out.print(x + " ");
        }
    }

}
