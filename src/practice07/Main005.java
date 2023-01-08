package practice07;

/** $$
 * [이진트리 순회(깊이우선탐색)]
 * 전위 : 부모 - 왼 - 오
 * 중위 : 왼 - 부모 - 오
 * 후위 : 왼 - 오 - 부모 ->> 병합정렬
 */
class Node005 {
    int data;
    Node005 lt, rt;

    public Node005(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main005 {

    Node005 root;

    public void DFS(Node005 root) {

        if(root == null) {
            return;
        } else {
            // System.out.print(root.data + " "); // 전위순회
            DFS(root.lt);
            // System.out.print(root.data + " "); // 중위순회
            DFS(root.rt);
            System.out.print(root.data + " "); // 후위순회
        }


    }

    public static void main(String[] args) {
        Main005 tree = new Main005();

        tree.root = new Node005(1);
        tree.root.lt = new Node005(2);
        tree.root.rt = new Node005(3);
        tree.root.lt.lt = new Node005(4);
        tree.root.lt.rt = new Node005(5);
        tree.root.rt.lt = new Node005(6);
        tree.root.rt.rt = new Node005(7);

        tree.DFS(tree.root);

    }
}
