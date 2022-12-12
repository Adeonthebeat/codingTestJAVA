package lecture07;

/** $$$$
 * [부분집합 구하기(DFS)] - 공집합 제외 | 이진트리!
 */
public class Main06 {

    static int n;
    static int[] ch;

    public void DFS(int L){

        // L이 4라면, print
        if(L == n + 1){
            String temp = "";
            for(int i = 1; i <= n; i++){
                // 있는지 체크
                if(ch[i] == 1){
                    // 있다면, 더하기
                    temp += (i + " ");
                }
            }
            // 공집합이 아니면.
            if(temp.length() > 0){
                System.out.println(temp);
            }
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }

    }
    /**
     3
     */
    public static void main(String[] args) {
        Main06 main = new Main06();

        n = 3;
        ch = new int[n+1];
        main.DFS(1);

    }
}
