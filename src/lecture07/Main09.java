package lecture07;

/**
 * $$$$
 * [Tree 말단 노드까지의 가장 짧은 경로] - DFS | 최단거리(BFS)
 */
class Node09 {
    int data;
    Node09 lt, rt;

    public Node09(int val){
        data = val;
        lt = rt = null;
    }

}
public class Main09 {

    Node09 root;

    public int DFS(int L, Node09 root) {

        // 말단 노드 체크(DFS를 쓸 수 있는 경우)
        if(root.lt == null && root.rt == null){
            // 엣지 개수!
            return L;
        } else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }

    }

    public static void main(String[] args) {
        Main09 tree = new Main09();

        tree.root = new Node09(1);
        tree.root.lt = new Node09(2);
        tree.root.rt = new Node09(3);
        tree.root.lt.lt = new Node09(4);
        tree.root.lt.rt = new Node09(5);

        System.out.println(tree.DFS(0, tree.root));


    }
}
