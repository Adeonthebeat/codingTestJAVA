package practice09;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge008 implements Comparable<Edge008> {
    public int vex;
    public int cost;

    public Edge008(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge008 o) {
        // 오름차순
        return this.cost - o.cost;
    }
}

/**
 * [원더랜드] - 최소스패닝트리 | 프림 | PriorityQueue
 */
public class Main008 {

    /**

     정점 : 도시 | 간선 : 도로 | 간선의 비용
     최소스패닝트리 : 그래프에서 트리구조 추출
     그래프 : 회로 있음 | 트리 : 회로 없음
     무방향 Queue
     PriorityQueue

     9 12
     1 2 12
     1 9 25
     2 3 10
     2 8 17
     2 9 8
     3 4 18
     3 7 55
     4 5 44
     5 6 60
     5 7 38
     7 8 35
     8 9 15
     */
    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        ArrayList<ArrayList<Edge008>> graph = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge008>());
        }

        int[] ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            graph.get(a).add(new Edge008(b, c));    // a -> b
            graph.get(b).add(new Edge008(a, c));     // b -> c
        }

        int result = 0;

        PriorityQueue<Edge008> pq = new PriorityQueue<>();

        pq.offer(new Edge008(1, 0));

        while(!pq.isEmpty()) {
            Edge008 temp = pq.poll();
            int ev = temp.vex;

            if(ch[ev] == 0) {
                ch[ev] = 1;
                result += temp.cost;

                for(Edge008 ob: graph.get(ev)) {
                    if(ch[ob.vex] == 0) {
                        pq.offer(new Edge008(ob.vex, ob.cost));
                    }
                }
            }
        }
        System.out.println(result);
    }
}
