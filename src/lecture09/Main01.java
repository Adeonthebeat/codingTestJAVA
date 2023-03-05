package lecture09;

import java.util.*;

/*
 * [씨름선수] - Greedy algorithm(동적계획법) | 최적의 선택
 */
class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        // 내림차순 정렬
        return o.h - this.h;
    }
}
public class Main01 {

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;

        Collections.sort(arr);

        int max = Integer.MIN_VALUE;

        for(Body ob : arr) {
            if(ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }

        return cnt;
    }

    /*
    5
    172 67
    183 65
    180 70
    170 72
    181 60
    */
    public static void main(String[] args) {
        Main01 main = new Main01();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Body> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int h = input.nextInt();
            int w = input.nextInt();
            arr.add(new Body(h, w));
        }

        System.out.println(main.solution(arr, n));

    }

}
