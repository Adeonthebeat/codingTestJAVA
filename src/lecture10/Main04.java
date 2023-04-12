package lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [가장 높은 탑 쌓기] - 동적계획법 | 큰 문제를 작게 쪼개서 푸는 방법 | 가장 높은 탑(피라미드)
 */
class Brick implements Comparable<Brick> {

    // 밑면의 넓이, 벽돌의 높이, 무게
    public int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        // 밑면의 넓이
        return o.s - this.s;
    }
}
public class Main04 {

    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        int result = 0;

        Collections.sort(arr);

        // 가장 넓은 면의 높이를 저장
        dy[0] = arr.get(0).h;

        // 초기화
        result = dy[0];

        for(int i = 1; i < arr.size(); i++) {
            int max_h = 0;

            for(int j = i-1; j >= 0; j--) {
                // 무게 체크 - 앞의 돌이 현재보다 무거워야 함
                if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            // 가장 높은 탑이라서 높이를 올리는 것
            dy[i] = max_h + arr.get(i).h;
            result = Math.max(result, dy[i]);
        }

        return result;
    }
    /*
    5
    25 3 4
    4 4 6
    9 2 3
    16 2 5
    1 5 2
    */
    public static void main(String[] args) {
        Main04 main = new Main04();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Brick> arr = new ArrayList<>();

        dy = new int[n];

        for(int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            arr.add(new Brick(a, b, c));
        }

        System.out.println(main.solution(arr));

    }
}
