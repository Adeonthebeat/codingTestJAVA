package practice07;

/** $$$
 * [Tree 말단 노드까지의 가장 짧은 경로] - DFS | 최단거리(BFS)
 */
class Node009 {
    int data;

    Node009 lt, rt;

    public Node009(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main009 {

    Node009 root;

    public int DFS(int L, Node009 root) {

        // 말단 노드 체크(DFS를 쓸 수 있는 경우)
        if(root.lt == null && root.rt == null) {
            // 엣지 갯수
            return L;
        } else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }

    }

    public static void main(String[] args) {
        Main009 tree = new Main009();

        tree.root = new Node009(1);
        tree.root.lt = new Node009(2);
        tree.root.rt = new Node009(3);
        tree.root.lt.lt = new Node009(4);
        tree.root.lt.rt = new Node009(5);

        System.out.println(tree.DFS(0, tree.root));

    }
}
