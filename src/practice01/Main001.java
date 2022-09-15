package practice01;

import java.util.Scanner;

/************************************
 * [문자 찾기]
 ************************************/
public class Main001 {

    public int solution(String str, char c){
        int result = 0;

        for(char x : str.toCharArray()){
            if(Character.toString(x).equalsIgnoreCase(Character.toString(c))){
                result++;
            }
        }
        return result;
    }


    //Computercooler c
    public static void main(String[] args){
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char c = input.next().charAt(0);
        System.out.println(main.solution(str, c));
    }

}
