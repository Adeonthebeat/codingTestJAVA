import java.util.Scanner;

public class Main04 {

    /**
     * 단어 뒤집기
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ret += str.charAt(i);
        }

        return ret;
    };

    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        int tot = input.nextInt();
        for(int i = 0; i < tot; i++){
            String str = input.next();
            System.out.println(main.solution(str));
        }
    }
}