import java.util.Scanner;

public class Main07 {

    /**
     * 회문 문자열
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "YES";
//        int len = str.length();
//        str = str.toUpperCase();
//
//        for(int i = 0; i < len/2; i++){
//            if(str.charAt(i) != str.charAt(len-1-i)){
//                //ret = "NO";
//                return "NO";
//            }
//        }

        String temp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(temp)){
            return "NO";
        }


        return ret;
    };
    // gooG
    public static void main(String[] args) {
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(main.solution(str));

    }
}