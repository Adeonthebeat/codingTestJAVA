package lecture02;

import java.util.Scanner;

/**
 * [가위바위보] - if문으로 해결!
 5
 2 3 3 1 3
 1 1 2 2 3
 */
public class Main03 {

    public String solution(int n, int[] arrayA, int[] arrayB){
        String result = "";

        for(int i = 0; i < n; i++){
            // A == B
            if(arrayA[i] == arrayB[i]){
                result += "D";
            } else if(arrayA[i] == 1 && arrayB[i] == 3){
                // A == 1 이기는 경우 B == 3
                result += "A";
            } else if(arrayA[i] == 2 && arrayB[i] == 1){
                // A == 2 이기는 경우 B == 1
                result += "A";
            } else if(arrayA[i] == 3 && arrayB[i] == 2) {
                // A == 3 이기는 경우 B == 2
                result += "A";
            } else {
                result += "B";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        for(int i = 0; i < n; i++){
            arrayA[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            arrayB[i] = input.nextInt();
        }
        for(char x : main.solution(n, arrayA, arrayB).toCharArray()){
            System.out.println(x);
        }

    }

}
