package lecture04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** $$$
 * [모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)] - Two Pointer(lt, rt) || sliding Window || hashMap.size() || hashMap == 0 빼기
 */
public class Main04 {

    public int solution(String strA, String strB){

        int result = 0;

        Map<Character, Integer> resultMapA = new HashMap<>();
        Map<Character, Integer> resultMapB = new HashMap<>();

        // 정답 Hash
        for(char x : strB.toCharArray()){
            resultMapB.put(x, resultMapB.getOrDefault(x, 0) + 1);
        }

        int L = strB.length() - 1;

        // 문제지 = 정답지 - 1
        for(int i = 0; i < L; i++){
            resultMapA.put(strA.charAt(i), resultMapA.getOrDefault(strA.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = L; rt < strA.length(); rt++){
            resultMapA.put(strA.charAt(rt), resultMapA.getOrDefault(strA.charAt(rt), 0) + 1);

            // resultMap 비교
            if(resultMapA.equals(resultMapB)){
                result++;
            }

            resultMapA.put(strA.charAt(lt), resultMapA.get(strA.charAt(lt)) - 1);

            if(resultMapA.get(strA.charAt(lt)) == 0){
                resultMapA.remove(strA.charAt(lt));
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
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        String strA = input.next();
        String strB = input.next();

        System.out.println(main.solution(strA, strB));

    }
}
