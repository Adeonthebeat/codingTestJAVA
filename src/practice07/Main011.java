package practice07;


import java.util.*;

/** $$$
 * [경로 탐색(인접행렬)] - DFS
 */
public class Main011 {

    static int n, m, result = 0;

    static int[][] graph;

    static int[] ch;

    public void DFS(int v) {

        if(v == n) {
            result++;
        } else {
            for(int i = 1; i <= n; i++) {
                // 가장 중요 - v정점에서 i정점으로 이동할 때 | 노드가 있으며, 방문한 적이 없을 때!
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 초기화
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
        Main011 main = new Main011();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        graph = new int[n+1][n+1]; // 노드가 5개
        ch = new int[n+1]; // 노드가 5개

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
