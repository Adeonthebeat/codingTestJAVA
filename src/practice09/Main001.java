package practice09;

import java.util.*;

/*
 * [씨름선수] - Greedy algorithm(동적계획법) | 최적의 선택
 */
class Body001 implements Comparable<Body001> {
    public int h, w;
    public Body001(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body001 o) {
        return o.h - this.h;
    }
}
public class Main001 {

    public int solution(ArrayList<Body001> arr) {
        int cnt = 0;

        Collections.sort(arr);

        int max = Integer.MIN_VALUE;

        for(Body001 ob : arr) {
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
        Main001 main = new Main001();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Body001> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int h = input.nextInt();
            int w = input.nextInt();
            arr.add(new Body001(h, w));
        }

        System.out.println(main.solution(arr));

    }

}
