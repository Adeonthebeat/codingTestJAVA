package lecture01;

import java.util.Scanner;

public class Main12 {

    /**
     * 문자열 압축
     * @param str
     * @return
     */
    public String solution(int cnt, String str){
        String result = "";

        // split
        for(int i = 0; i < cnt; i++){
            // split && replace(# = 1 * = 0)
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            // 이진수 -> 십진수
            int num = Integer.parseInt(temp, 2);

            // int를 알바펫화 후, 한단어씩 더해주기
            result += (char) num;
            str = str.substring(7);
        }
        return result;
    };

    // 4
    // #****###**#####**#####**##**
    // -->> COOL
    public static void main(String[] args) {
        Main12 main = new Main12();
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        String str = input.next();
        System.out.println(main.solution(cnt, str));
    }
}