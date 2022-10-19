package practice04;

import java.util.*;

/** $
 * [학습 회장(해쉬)] - HashMap || HashMap.keySet() || HashMap.get(key)
 */
public class Main001 {

    public Character solution(int n, String str){

        char result = 0;

        Map<Character, Integer> resultMap = new HashMap<>();

        for(char x : str.toCharArray()){
            resultMap.put(x, resultMap.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        for(char key : resultMap.keySet()){
            if(resultMap.get(key) > max){
                max = resultMap.get(key);
                result = key;
            }
        }
        return result;
    }

/**
15
BACBACCACCBDEDE
*/
    public static void main(String[] args) {
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();

        System.out.println(main.solution(n, str));

    }
}
