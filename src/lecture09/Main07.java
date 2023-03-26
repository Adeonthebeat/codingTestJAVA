package lecture09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge07 implements Comparable<Edge07> {
    public int v1;
    public int v2;
    public int cost;

    public Edge07(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge07 o) {
        return this.cost - o.cost; // 오름차순 정렬
    }
}
/**
 * [원더랜드] - 최소스패닝트리 | 크루스칼 | Union & Find
 */
public class Main07 {

    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) {
            unf[fa] = fb;
        }
    }


    /**

     정점 : 도시 | 간선 : 도로 | 간선의 비용
     최소스패닝트리 : 그래프에서 트리구조 추출
     그래프 : 회로 있음 | 트리 : 회로 없음
     Union & Find 암기

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
        Main07 main = new Main07();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        unf = new int[n+1];

        ArrayList<Edge07> arr = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            arr.add(new Edge07(a, b, c));
        }

        int result = 0;

        // 정렬(Cost 오름차순)
        Collections.sort(arr);

        for(Edge07 ob : arr) {

            int fv1 = find(ob.v1);
            int fv2 = find(ob.v2);

            if(fv1 != fv2) {
                result += ob.cost;
                union(ob.v1, ob.v2);
            }
        }
        System.out.println(result);
    }

}
