package lecture09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [회의실 배정] - Greedy algorithm(동적계획법) | 최대수의 회의 | 시작시간 <= 끝나는 시간
 */
class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        // 만약 끝나는 시간이 같다면. 시작시간 오름차순
        if(this.e == o.e) {
            return this.s - o.s;
        } else {
            // 끝나는 시간 오름차순
            return this.e - o.e;
        }
    }
}
public class Main02 {

    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int endTime = 0;

        for(Time ot : arr) {
            if(ot.s >= endTime){
                cnt++;
                endTime = ot.e;
            }
        }

        return cnt;
    }

    /*
    1) 회의가 빨리 끝나는 시간으로 오름차순 정렬
    2) 시작시간 오름차순 정렬

    5
    1 4
    2 3
    3 5
    4 6
    5 7

    3
    3 3
    1 3
    2 3

    */
    public static void main(String[] args) {
        Main02 main = new Main02();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Time> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int s = input.nextInt();
            int e = input.nextInt();

            arr.add(new Time(s, e));
        }

        System.out.println(main.solution(arr, n));

    }

}
