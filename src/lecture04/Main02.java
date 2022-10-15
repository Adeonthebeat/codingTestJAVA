package lecture04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * [아나그램(해쉬)] - contains!
 */
public class Main02 {

    public String solution(String strA, String strB){
        /*
        String result = "NO";

        Map<Character, Integer> resultMapA = new HashMap<>();
        Map<Character, Integer> resultMapB = new HashMap<>();

        for(char x : strA.toCharArray()){
            resultMapA.put(x, resultMapA.getOrDefault(x, 0) + 1);
        }

        for(char x : strB.toCharArray()){
            resultMapB.put(x, resultMapB.getOrDefault(x, 0) + 1);
        }

        int cnt = 0;
        for(char keyA : resultMapA.keySet()){
            for(char keyB : resultMapB.keySet()){
                if(keyA == keyB){
                    if(resultMapA.get(keyA) == resultMapB.get(keyB)){
                        cnt++;
                    }
                }
            }
        }

        if(resultMapA.size() == cnt){
            result = "YES";
        }

         */

        String result = "YES";
        HashMap<Character, Integer> resultMap = new HashMap<>();

        for(char x: strA.toCharArray()){
            resultMap.put(x, resultMap.getOrDefault(x, 0) + 1);
        }

        for(char x : strB.toCharArray()){
            if(!resultMap.containsKey(x) || resultMap.get(x) == 0){
                return "NO";
            }
            resultMap.put(x, resultMap.get(x) - 1);
        }

        return result;
    }
/*
AbaAeCe
baeeACA

abaCC
Caaab
*/
    /**
     * 학급 회장(해쉬)
     * @param args
     */
    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        String strA = input.next();
        String strB = input.next();

        System.out.println(main.solution(strA, strB));
    }
}
