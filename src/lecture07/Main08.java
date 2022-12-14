package lecture07;

import java.util.*;

/**
 * $$$$
 * [송아지 찾기(BFS : 상태트리탐색)] - 최단거리! | 3개의 방법(1, -1, 5)
    | Q.offer | Q.isEmpty | Q.poll | Q.offer
 */
public class Main08 {

    int[] dis = {1, -1, 5};

    static int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {

        ch = new int[10001];

        // 시작점
        ch[s] = 1;

        Q.offer(s);

        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
//                if(x == e){
//                    return L;
//                }
                for(int j = 0; j < 3; j++){
                    int nx = x + dis[j];
                    if(nx == e){
                        return L+1;
                    }
                    // 0 < 뛰어간 거리 < 10000이면서 비어있다면
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 00){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++; // 레벨 증가
        }

        return 0;
    }

    /**
     * 3
     */
    public static void main(String[] args) {
        Main08 main = new Main08();
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int e = input.nextInt();

        System.out.println(main.BFS(s, e));

    }
}
