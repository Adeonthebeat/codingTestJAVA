package test04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * [학급회장(해쉬)]
 */
public class Main01 {

    public char solution(int n, String str) {
        char result = 0;

        int max = Integer.MIN_VALUE;

        Map<Character, Integer> resultMap = new HashMap<>();

        for(char x : str.toCharArray()) {
            resultMap.put(x, resultMap.getOrDefault(x, 0) + 1);
        }

        for(char key : resultMap.keySet()) {
            if(resultMap.get(key) > max) {
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
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        System.out.println(main.solution(n, str));

    }

}