package lecture07;

import java.util.*;

/**
 * $$$$
 * [경로 탐색(인접행렬)] - 체크리스트
 */
public class Main12 {

    static int n, m, result = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {

        if(v == n) {
            result++;
        } else {
            for(int nv : graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    /*
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
        Main12 main = new Main12();
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        ch = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();

        // 노드 개수만큼 생성 | 가장 중요
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            graph.get(a).add(b); // 5번 list - 9

        }

        ch[1] = 1;
        main.DFS(1);
        System.out.println(result);

    }
}
