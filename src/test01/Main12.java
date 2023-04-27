package test01;

import java.util.Scanner;

/**
 * [암호] - replace / substring / substring(7)
 */
public class Main12 {

    public String solution(int n, String str) {
        String result = "";

        for(int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            int num = Integer.parseInt(temp, 2);

            result += (char) num;

            str = str.substring(7);
        }

        return result;
    }

/*
4
#****###**#####**#####**##**
*/
    public static void main(String[] args) {
        Main12 main = new Main12();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        System.out.println(main.solution(n, str));

    }

}
