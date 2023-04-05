package practice09;

import java.util.Scanner;

/**
 * [친구인가?] - Disjoint-Set(서로소) || Union&Find
 */
public class Main006 {

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
     반 학생수 = N | 숫자쌍 = M
     맨 마지막은 3번과 8번 친구끼리 친구인가?

     9 7
     1 2
     2 3
     3 4
     1 5
     6 7
     7 8
     8 9
     3 8
     */
    public static void main(String[] args) {
       Main006 main = new Main006();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        unf = new int[n+1];

        for(int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for(int i = 1; i <= m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            // 친구 관계
            union(a, b);
        }

        int a = input.nextInt();
        int b = input.nextInt();

        int fa = find(a);
        int fb = find(b);

        if(fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
