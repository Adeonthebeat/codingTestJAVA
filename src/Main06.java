import java.util.ArrayList;
import java.util.Scanner;

public class Main06 {

    /**
     * 중목문자 제거
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "";

        for(int i = 0; i < str.length(); i++){
            //System.out.println(str.charAt(i) + " " + i +" "+str.indexOf(str.charAt(i)));
            // 이미 데이터가 있다면, 해당 Index를 나타냄
            if(i == str.indexOf(str.charAt(i))){
                ret += str.charAt(i);
            }
        }

        return ret;
    };

    // ksekkset
    public static void main(String[] args) {
        Main06 main = new Main06();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));

    }
}