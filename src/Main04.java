import java.util.ArrayList;
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

    /**
     * 단어 뒤집기
     * @param str
     * @return
     */
//    public ArrayList<String> solution(int n, String[] str){
//        ArrayList<String> ret = new ArrayList<String>();
//        for(String x : str){
//            String temp = new StringBuilder(x).reverse().toString();
//            ret.add(temp);
//        }
//
////        for(String x : str){
////            char[] s = x.toCharArray();
////            int lt = 0, rt = x.length() - 1;
////            while(lt < rt){
////                char temp = s[lt];
////                s[lt] = s[rt];
////                s[rt] = temp;
////                lt++;
////                rt--;
////            }
////            String temp = String.valueOf(s);
////            ret.add(temp);
////        }
//        return ret;
//    };
//
//    public static void main(String[] args) {
//        Main04 main = new Main04();
//        Scanner input = new Scanner(System.in);
//
//        int tot = input.nextInt();
//        String[] str = new String[tot];
//
//        for(int i = 0; i < tot; i++){
//            str[i] = input.next();
//        }
//
//        // foreach
//        for(String x : main.solution(tot, str)){
//            System.out.println(x);
//        }
//
//    }
}