package lecture07;

import java.util.Scanner;

/** $$$$
 * [이진트리 순회(깊이우선탐색)] -
 * 전위 : 부모 - 왼 - 오
 * 중위 : 왼 - 부모 - 오
 * 후위 : 왼 - 오 - 부모 ->> 병합정렬
 */

class Node {
   int data;
   Node lt, rt;
   public Node(int val){
       data = val;
       lt = rt = null;
   }
}
public class Main05 {

    Node root;
    public void DFS(Node root){
        if(root == null){
            return;
        } else {
//            System.out.print(root.data + " "); // 전위순회
            DFS(root.lt);
//            System.out.print(root.data + " "); // 중위순회
            DFS(root.rt);
//            System.out.print(root.data + " "); // 후위순회
        }
    }

    public static void main(String[] args) {
        Main05 tree = new Main05();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }
}
