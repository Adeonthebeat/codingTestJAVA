package lecture09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * [최대수입스케쥴] - PriorityQueue | 최대로 벌 수 있는 수입
 */
class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture o) {
        // 내림차순
        return o.time - this.time;
    }
}
public class Main04 {

    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int result = 0;

        // Default : 작은 값 우선
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 날짜 내림차순
        Collections.sort(arr);

        int j = 0;
        // 가장 큰 날짜부터 1일까지
        for(int i = max; i >= 1; i--) {
            for(; j < n; j++) {
                // 시간대별로 쪼개기
                if(arr.get(j).time < i){
                    break;
                }
                pq.offer(arr.get(j).money);
            }
            // 해당 날짜에 가장 큰 값 추출
            if(!pq.isEmpty()) {
                result += pq.poll();
            }
        }
        return result;
    }


    /*
    1) 하루에 하나의 기업에서만 강연
    2) Priority Queue - 최선의 값을 찾아라.
    3) 시간에 의해서 정렬(내림차순) -> 3일 2일 1일

    6
    50 2
    20 1
    40 2
    60 3
    30 3
    30 1

    */
    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int m = input.nextInt();
            int d = input.nextInt();
            arr.add(new Lecture(m, d));
            if(d > max) {
                max = d;
            }
        }

        System.out.println(main.solution(arr));

    }

}
