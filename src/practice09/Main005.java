package practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * [다익스트라 알고리즘] - 다익스트라 || 다익스트라는 음수가 없음 ||
 */
class Edge005 implements Comparable<Edge005> {
    public int vex;     // 점선
    public int cost;    // 가중치

    Edge005(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge005 o) {
        // 오름차순(작은 값 우선)
        return this.cost - o.cost;
    }
}
public class Main005 {

    static int n, m;
    static ArrayList<ArrayList<Edge005>> graph;
    static int[] dis;

    public void solution(int v) {
        PriorityQueue<Edge005> pq = new PriorityQueue<>();

        // 오름차순 기준
        pq.offer(new Edge005(v, 0));

        // 첫번째 값 = 0
        dis[v] = 0;

        while(!pq.isEmpty()) {
            // 최소값
            Edge005 temp = pq.poll();
            int now = temp.vex;     // now = 1
            int nowCost = temp.cost;// newCost = 0

            // 작은 값을 체크하기 | 필요 없으면 continue
            if(nowCost > dis[now]) {
                continue;
            }

            // 현재 now와 연결된 개체 모든 것을 조회
            for(Edge005 ob : graph.get(now)) {
                // 2번정점 > 0 + 12(비용) >> 최소비용
                if(dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    // (2, 12), (3, 4) 최소값을 찾아감
                    pq.offer(new Edge005(ob.vex, nowCost + ob.cost));
                }
            }

        }

    }


 /*
 1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력
 dis[3] = 1 // 3번 지점까지 가는 비용은 1

 6 9
 1 2 12
 1 3 4
 2 1 2
 2 3 5
 2 5 5
 3 4 5
 4 2 2
 4 5 5
 6 4 5
 // 1번 정점에서 2번정점으로 가는데 12의 비용이 든다.
  */

    public static void main(String[] args) {
        Main005 main = new Main005();
        Scanner input = new Scanner(System.in);

        n = input.nextInt(); // 점섬의 개수
        m = input.nextInt(); // 간선의 개수

        // ArrayList 객체를 저장할 수 있는 ArrayList
        graph = new ArrayList<ArrayList<Edge005>>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge005>());
        }

        dis = new int[n+1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            graph.get(a).add(new Edge005(b, c));
        }

        main.solution(1);

        for(int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }

    }

}
