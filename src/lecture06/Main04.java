package lecture06;

import java.util.Scanner;

/** $$$$
 * [Least Recently Used] - 삽입정렬 | 0번 자리 | 뒤에서부터
 */
public class Main04 {

    public int[] solution(int size, int k, int[] arr){

        int[] cache = new int[size];

        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < size; i++) {
                // Cache Hit
                if(x == cache[i]){
                    pos = i;
                }
            }

            // Cache Miss ( 뒤로 밀어내기 )
            if(pos == -1) {
                for(int i = size - 1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            } else {
                // Cache Hit 처리
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    /**
     5 9
     1 2 3 2 6 2 3 5 7
     */


    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        int size = input.nextInt(); // Cache size
        int n = input.nextInt(); // 작업의 개수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int x : main.solution(size, n, arr)){
            System.out.print(x + " ");
        }

    }
}
