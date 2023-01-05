package practice07;

/** $$
 * [팩토리얼] - n * solution(n-1)
 */
public class Main003 {

    public int solution(int n) {

        if(n == 1) {
            return 1;
        } else {
            return n * solution(n-1);
        }

    }

    public static void main(String[] args) {
        Main003 main = new Main003();

        int n = 5;

        System.out.println(main.solution(5));

    }
}
