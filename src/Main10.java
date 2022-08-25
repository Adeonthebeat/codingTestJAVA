import java.util.Scanner;

public class Main10 {

    /**
     * 가장 짧은 문자거리
     * 왼쪽의 타켓과의 거리를 구함.
     * 오른쪽의 타켓과의 거리를 구함. -> 작은 값으로 교체
     * @param str
     * @return
     */
    public int[] solution(String str, char target){
        int[] result = new int[str.length()];
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }
        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }
        return result;
    };
    // teachermode e
    public static void main(String[] args) {
        Main10 main = new Main10();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char target = input.next().charAt(0);
        for(int x : main.solution(str, target)){
            System.out.print(x+" ");
        }
    }
}