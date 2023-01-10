package practice07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * $$$
 * [이진트리 순회(BFS)] - 넓이우선탐색 : 레벨탐색
 */
class Node007 {
    int data;

    Node007 lt, rt;

    public Node007(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main007 {

    Node007 root;

    public void BFS(Node007 root) {

        Queue<Node007> Q = new LinkedList<>();

        Q.offer(root);

        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                Node007 current = Q.poll();

                System.out.print(current.data + " ");

                if(current.lt != null) {
                    Q.offer(current.lt);
                }

                if(current.rt != null) {
                    Q.offer(current.rt);
                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Main007 tree = new Main007();

        tree.root = new Node007(1);
        tree.root.lt = new Node007(2);
        tree.root.rt = new Node007(3);
        tree.root.lt.lt = new Node007(4);
        tree.root.lt.rt = new Node007(5);
        tree.root.rt.lt = new Node007(6);
        tree.root.rt.rt = new Node007(7);

        tree.BFS(tree.root);
    }
}
