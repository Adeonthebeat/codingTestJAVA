package practice07;


import java.util.ArrayList;
import java.util.Scanner;

/** $$$
 * [경로 탐색(인접리스트)] - DFS | 체크리스트
 */
public class Main012 {

    static int n, m, result = 0;

    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {

        if(v == n) {
            result++;
        } else {
            // 가장 중요 - v정점에서 i정점으로 이동할 때
            for(int nv : graph.get(v)) {
                // 노드가 있으며, 방문한 적이 없을 때!
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
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
        Main012 main = new Main012();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        ch = new int[n+1];

        graph = new ArrayList<ArrayList<Integer>>();

        // 리스트를 저장하는 리스트
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 노드 개수만큼 리스트 객체 생성 | 가장 중요
        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            // * 1개의 정점에 하나씩 추가 | 모두 5개 리스트 | 9개 값 저장
            graph.get(a).add(b);
        }

        ch[1] = 1;
        main.DFS(1);
        System.out.println(result);

    }
}
