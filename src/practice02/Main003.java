package practice02;

import java.util.Scanner;

/** $
 * [가위 바위 보]
 */
public class Main003 {

    public String solution(int n, int[] arrA, int[] arrB){
        String result = "";

        for(int i = 0; i < n; i++){
            if(arrA[i] == arrB[i]){
                result += "D";
            } else if(arrA[i] == 1 && arrB[i] == 3){
                result += "A";
            } else if(arrA[i] == 2 && arrB[i] == 1){
                result += "A";
            } else if(arrA[i] == 3 && arrB[i] == 2){
                result += "A";
            } else {
                result += "B";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main003 main = new Main003();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            arrB[i] = input.nextInt();
        }

        for(char x : main.solution(n, arrA, arrB).toCharArray()){
            System.out.println(x + " ");
        }

    }
}
