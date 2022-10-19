package practice04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** $
 * [아나그램(해쉬)] resultMap 2개 || contains || get == 0
 */
public class Main002 {

    public String solution(String strA, String strB){

        String result = "YES";

        Map<Character, Integer> resultMapA = new HashMap<>();
        Map<Character, Integer> resultMapB = new HashMap<>();

        for(char x : strA.toCharArray()){
            resultMapA.put(x, resultMapA.getOrDefault(x, 0) + 1);
        }
        for(char x : strB.toCharArray()){
            resultMapB.put(x, resultMapB.getOrDefault(x, 0) + 1);
        }

        if(!resultMapA.equals(resultMapB)){
            result = "NO";
        }

        /*
        for(char x : strB.toCharArray()){
            if(!resultMapA.containsKey(x) || resultMapA.get(x) == 0){
                return  "NO";
            }
            resultMapA.put(x, resultMapA.get(x) - 1);
        }
        */

        return result;
    }

/**
AbaAeCe
baeeACA

abaCC
Caaab
*/
    public static void main(String[] args) {
        Main002 main = new Main002();
        Scanner input = new Scanner(System.in);

        String strA = input.next();
        String strB = input.next();

        System.out.println(main.solution(strA, strB));

    }
}
