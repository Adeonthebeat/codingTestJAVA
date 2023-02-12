package lecture08;

import java.util.ArrayList;
import java.util.Scanner;

/** $$$$
 * [피자 배달 거리] - DFS | 0 = 빈칸, 1 = 집, 2 = 피자집 | 최소값
 * [중요] 도시의 피자배달거리 = 각 집마다 피자배달거리의 합
 */
class Point15 {
    public int x, y;
    Point15(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main15 {

    static int n, m, len, result = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point15> hs, pz; // 집, 피자집

    public void DFS(int L, int s) {
        if(L == m) {
            int sum = 0;
            // 집 선택
            for(Point15 h : hs) {
                int dis = Integer.MAX_VALUE;

                // 폐업 안 한 피자집과 비교
                for(int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                // 도시의 피자배달거리 = 각 집마다 피자배달거리의 합
                sum += dis;
            }
            result = Math.min(result, sum);
        } else {
            // 외워(s부터 선택한 피자집 개수까지)
            for(int i = s; i < len; i++) {
                combination[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    /**
     4 4
     0 1 2 0
     1 0 2 1
     0 2 1 2
     2 0 1 2
     */
    public static void main(String[] args) {
        Main15 main = new Main15();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt(); // 선택한 피자집 M개

        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int temp = input.nextInt();
                // 집
                if(temp == 1) {
                    hs.add(new Point15(i, j));
                }
                // 피자집
                else if(temp == 2) {
                    pz.add(new Point15(i, j));
                }
            }
        }

        // 피자집의 개수
        len = pz.size();

        // len 컴비네이션 m = 피자집의 개수에서 m개를 추출
        combination = new int[m];

        // 조합
        main.DFS(0, 0);

        System.out.println(result);

    }

}
