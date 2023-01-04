package lecture07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * $$$$
 * [그래프 최단거리(BFS)] - 최단거리 = BFS | 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.
 */
public class Main13 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis; //

    public void BFS(int v) {

        Queue<Integer> Q = new LinkedList<>();

        ch[v] = 1;
        dis[v] = 0;

        Q.offer(v);

        while(!Q.isEmpty()) {
            int cv = Q.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    Q.offer(nv);
                    // * 가장 중요
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

/*
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
        Main13 main = new Main13();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        // 리스트를 저장하는 인접리스트
        graph = new ArrayList<ArrayList<Integer>>();

        // 노드 개수만큼 리스트 객체 생성 | 가장 중요
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];
        dis = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            // * 1개의 정점에 하나씩 추가 | 모두 5개 리스트 | 9개 값 저장
            graph.get(a).add(b);

        }

        main.BFS(1);
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]);
        }

    }
}
