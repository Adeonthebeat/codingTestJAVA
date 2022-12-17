package lecture07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * $$$$
 * [Tree 말단 노드까지의 가장 짧은 경로] - BFS
 */

class Node10 {
    int data;
    Node10 lt, rt;
    public Node10(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main10 {

    Node10 root;



    public int BFS(Node10 root){

        Queue<Node10> Q = new LinkedList<>();

        Q.offer(root);

        int Lvl = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                Node10 current = Q.poll();

                // 가장 작은 레벨 출력
                if(current.lt == null && current.rt == null) {
                    return Lvl;
                }

                if(current.lt != null) {
                    Q.offer(current.lt);
                }

                if(current.rt != null) {
                    Q.offer(current.rt);
                }
            }
            Lvl++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Main10 tree = new Main10();

        tree.root = new Node10(1);
        tree.root.lt = new Node10(2);
        tree.root.rt = new Node10(3);
        tree.root.lt.lt = new Node10(4);
        tree.root.lt.rt = new Node10(5);

        System.out.println(tree.BFS(tree.root));

    }
}
