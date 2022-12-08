package lecture07;

import java.util.Scanner;

/** $$
 * [팩토리얼] - n * solution(n-1)
 */
public class Main03 {

    public int solution(int n){

        if(n == 1){
            return 1;
        } else {
            return n * solution(n-1);
        }

    }
/**
5
*/
    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        System.out.println(main.solution(input.nextInt()));

    }
}
