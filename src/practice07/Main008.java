package practice07;

import java.util.*;

/** $$
 * [송아지 찾기] - BFS : 상태트리탐색 | 점프의 최소횟수
 */
public class Main008 {

    int[] dis = {1, -1, 5};

    int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {

        ch = new int[10001];

        ch[s] = 1;

        Q.offer(s);

        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                int x = Q.poll();

                for(int j = 0; j < 3; j++) {
                    int nx = x + dis[j];

                    if(nx == e) {
                        return L+1;
                    }

                    if(nx > 0 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int e = input.nextInt();

        System.out.println(main.BFS(s, e));

    }
}
