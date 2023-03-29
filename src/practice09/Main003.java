package practice09;

import java.util.*;

/**
 * [결혼식] - Greedy algorithm(동적계획법) | 최대 인원
 */
class Time003 implements Comparable<Time003> {
    public int time;
    public char state;

    public Time003(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time003 o) {
        if(this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}
public class Main003 {

    public int solution(ArrayList<Time003> arr) {
        int result = 0;

        Collections.sort(arr);

        int cnt = 0;
        for(Time003 ob : arr) {
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
        Main003 main003 = new Main003();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Time003> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int s = input.nextInt();
            int e = input.nextInt();
            arr.add(new Time003(s, 's'));
            arr.add(new Time003(e, 'e'));
        }

        System.out.println(main003.solution(arr));

    }

}