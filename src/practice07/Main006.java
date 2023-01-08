package practice07;

/** $$
 * [부분집합 구하기(DFS)] -
 */
public class Main006 {

    static int n;

    static int[] ch;

    public void DFS(int L) {
        // n = 3일 떄, 4와 같다면
        if(L == n+1) {
            String temp = "";
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 1) {
                    temp += (i + " ");
                }
            }
            if(temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            ch[L] = 1; // 사용
            DFS(L+1);
            ch[L] = 0; // 미사용
            DFS(L+1);
        }
    }


    public static void main(String[] args) {
        Main006 main = new Main006();

        n = 3;
        ch = new int[n+1];

        main.DFS(1);


    }
}
