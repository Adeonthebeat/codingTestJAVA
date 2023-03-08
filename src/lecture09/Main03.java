package lecture09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [결혼식] - Greedy algorithm(동적계획법) | 최대 인원
 */
class Time03 implements Comparable<Time03> {
    public int time;
    public char state;
    Time03(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time03 o) {
        if(this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}
public class Main03 {

    public int solution(ArrayList<Time03> arr) {
        int result = Integer.MIN_VALUE;

        Collections.sort(arr);

        int cnt = 0;
        for(Time03 ob : arr) {
            // 시작이라면, COUNT++
            if(ob.state == 's') {
                cnt++;
            }
            // 끝이라면, COUNT--
            else {
                cnt--;
            }
            result = Math.max(result, cnt);
        }

        return result;
    }

    /*
    1) 시간 sort
    2) 상태 sort

    5
    14 18
    12 15
    15 20
    20 30
    5 14

    */
    public static void main(String[] args) {
        Main03 main = new Main03();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Time03> arr = new ArrayList<>();

        for(int i = 0;  i < n; i++) {
            int s = input.nextInt();
            int e = input.nextInt();
            arr.add(new Time03(s, 's'));
            arr.add(new Time03(e, 'e'));
        }

        System.out.println(main.solution(arr));

    }

}
