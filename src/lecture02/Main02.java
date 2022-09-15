package lecture02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * [보이는 학생]
 */
public class Main02 {

    public int solution(int cnt, int[] array){
        int result = 1;
        int max = array[0];
        for(int i = 1; i < cnt; i++){
            if(array[i] > max){
                result++;
                max = array[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] array = new int[target];

        for(int i = 0; i < target; i++){
            array[i] = input.nextInt();
        }

        System.out.println(main.solution(target, array));

    }

}
