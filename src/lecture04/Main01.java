package lecture04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** $$
 * [학급 회장(해쉬)] - HashMap ||
 */
public class Main01 {

    public char solution(int n, String str){
        char result = 0;
        Map<Character, Integer> resultMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(char x : str.toCharArray()){
            resultMap.put(x, resultMap.getOrDefault(x, 0) + 1);
        }

        for(char key : resultMap.keySet()){
            //System.out.println(key + " " + resultMap.get(key));
            if(resultMap.get(key) > max){
                max = resultMap.get(key);
                result = key;
            }
        }

        return result;
    }
/*
15
BACBACCACCBDEDE
*/
    /**
     * 학급 회장(해쉬)
     * @param args
     */
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        System.out.println(main.solution(n, str));
    }
}
