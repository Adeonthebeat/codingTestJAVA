import java.util.Scanner;

public class Main01 {

    /**
     * 문자찾기
     * @param str
     * @param t
     * @return
     */
    public int solution(String str, char t){
        int ret = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        for(int i = 0; i < str.length(); i++){
//            char x = str.charAt(i);
//
//            if(x == t){
//                ret += 1;
//            }
//        }
        for(char x : str.toCharArray()){
            if(x == t){
                ret++;
            }
        }
        return ret;
    };

    // psvm
    // sout
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char t = in.next().charAt(0);
        System.out.println(main.solution(str, t));
    }
}