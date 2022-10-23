package practice04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** $$$
 * [모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)]
 */
public class Main004 {

    public int solution(String str, String k){

        int result = 0;
        Map<Character, Integer> targetMap = new HashMap<>(); // taget
        Map<Character, Integer> resultMap = new HashMap<>(); // result

        // Target
        for(char x : k.toCharArray()){
            targetMap.put(x, targetMap.getOrDefault(x, 0) + 1);
        }

        int L = k.length() - 1;

        // result
        for(int i = 0; i < L; i++){
            resultMap.put(str.charAt(i), resultMap.getOrDefault(str.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = L; rt < str.length(); rt++){
            resultMap.put(str.charAt(rt), resultMap.getOrDefault(str.charAt(rt), 0) + 1);

            if(resultMap.equals(targetMap)){
                result++;
            }

            resultMap.put(str.charAt(lt), resultMap.get(str.charAt(lt)) - 1);
            if(resultMap.get(str.charAt(lt)) == 0){
                resultMap.remove(str.charAt(lt));
            }
            lt++;
        }

        return result;
    }
/*
bacaAacba
abc

bacaAacbaa
abca
*/
    public static void main(String[] args) {
        Main004 main = new Main004();
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String k = input.next();

        System.out.println(main.solution(str, k));

    }
}
