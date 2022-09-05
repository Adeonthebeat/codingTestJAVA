package practice01_String;

import java.util.Scanner;

/**
 * [가장 짧은 문자] - isDigit // ASCII Code
 */
public class Main010 {

    public int[] solution(String str, char target){
        int[] result = new int[str.length() + 1];
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            // 왼쪽

            // 오른쪽
        }

        return result;
    }

    public static void main(String[] args) {
        Main010 main = new Main010();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char target = input.next().charAt(0);
        for(int x: main.solution(str, target)){
            System.out.println(x + " ");
        }
    }

}
