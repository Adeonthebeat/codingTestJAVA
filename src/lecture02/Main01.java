package lecture02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * [큰 수 출력하기]
 */
public class Main01 {

    public List<Integer> solution(int[] array){
        List<Integer> result = new ArrayList<Integer>();
        result.add(0, array[0]);
        for(int i = 1; i < array.length; i++){
           if(array[i-1] < array[i]){
               result.add(array[i]);
           }
        }
        return result;
    }


    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        int[] array = new int[target];

        for(int i = 0; i < target; i++){
            array[i] = input.nextInt();
        }

        List<Integer> result = main.solution(array);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }

    }

}
