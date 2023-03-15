package lecture09;

import java.util.Scanner;

/**
 * [친구인가?] - Disjoint-Set(서로소) || Union&Find
 */
public class Main06 {

    static int[] unf; // 학생의 번호와 학생의 집합 배열

    /**
     * 각 학생의 집합번호 return.
     * @param v
     * @return
     */
    public static int Find(int v) {
        if(v == unf[v]) {
            return v;
        } else {
            return unf[v] = Find(unf[v]);
        }
    }

    /**
     * 각 학생끼리 집합으로 묶어주기
     * @param a
     * @param b
     */
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);

        // 서로 같지 않다면, 채워넣기 ->> unf[4] = 5;
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
        Main06 main = new Main06();
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

            // 친구관계
            Union(a, b);
        }

        int a = input.nextInt();
        int b = input.nextInt();

        int fa = Find(a);
        int fb = Find(b);

        if(fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
