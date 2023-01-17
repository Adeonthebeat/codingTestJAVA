package practice07;


import java.util.*;

/** $$$
 * [그래프 최단거리(BFS)] - BFS
 */
public class Main013 {

    static int n, m = 0;

    static ArrayList<ArrayList<Integer>> graph;

    static int[] ch, dis;

    public void BFS(int v) {

        Queue<Integer> Q = new LinkedList<>();

        ch[v] = 1;
        dis[v] = 0;

        Q.offer(v);

        while(!Q.isEmpty()) {
            int cv = Q.poll();

            // 현재리스트와 연결된 리스트 찾기
            for(int nv : graph.get(cv)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    Q.offer(nv);
                    // 가장 중요 | v까지 가는 최소 비용
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    /**
     6 9
     1 3
     1 4
     2 1
     2 5
     3 4
     4 5
     4 6
     6 2
     6 5
     */
    public static void main(String[] args) {
        Main013 main = new Main013();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();

        ch = new int[n+1];
        dis = new int[n+1];

        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            graph.get(a).add(b);
        }

        main.BFS(1);

        // 2번 정점부터 차례대로 출력
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]);
        }

    }
}
