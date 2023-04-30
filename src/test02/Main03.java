package test02;

import java.util.Scanner;

public class Main03 {

    public String[] solution(int n, int[] arrA, int[] arrB) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            if(arrA[i] == 1 && arrB[i] == 3) {
                result[i] = "A";
            } else if(arrA[i] == 2 && arrB[i] == 1) {
                result[i] = "A";
            } else if(arrA[i] == 3 && arrB[i] == 2) {
                result[i] = "A";
            } else if(arrA[i] == arrB[i]) {
                result[i] = "D";
            }
            else {
                result[i] = "B";
            }
        }

        return result;
    }
/**
* [가위바위보] - if문으로 해결!
5
2 3 3 1 3
1 1 2 2 3
*/
    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arrB[i] = input.nextInt();
        }

        for(String x : main.solution(n, arrA, arrB)) {
            System.out.println(x);
        }

    }
}
