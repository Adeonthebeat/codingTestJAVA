package lecture07;

import java.util.*;

/**
 * $$$$
 * [경로 탐색(인접행렬)] - DFS
 */
public class Main11 {

    static int n, m, result = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {

        if(v == n) {
            result++;
        } else {
            for(int i = 1; i <= n; i++) {
                // 노드가 있으며, 방문한 적이 없을 때!
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 다시 초기화
                }
            }
        }

    }

    /**
     5 9
     1 2
     1 3
     1 4
     2 1
     2 3
     2 5
     3 4
     4 2
     4 5
     */
    public static void main(String[] args) {
        Main11 main = new Main11();
        Scanner input = new Scanner(System.in);

        n = input.nextInt(); // 노드
        m = input.nextInt(); // 간선

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(result);

    }
}
