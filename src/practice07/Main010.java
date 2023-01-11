package practice07;

import java.util.*;

/** $$
 * [Tree 말단 노드까지의 가장 짧은 경로] - BFS
 */
class Node010 {
    int data;
    Node010 lt, rt;

    public Node010(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main010 {

    Node010 root;

    public int BFS(Node010 root) {

        Queue<Node010> Q = new LinkedList<>();

        Q.offer(root);

        int Lvl = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();

            for(int i = 0; i < len; i++) {
                Node010 current = Q.poll();

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
        Main010 tree = new Main010();

        tree.root = new Node010(1);
        tree.root.lt = new Node010(2);
        tree.root.rt = new Node010(3);
        tree.root.lt.lt = new Node010(4);
        tree.root.lt.rt = new Node010(5);

        System.out.println(tree.BFS(tree.root));


    }
}
