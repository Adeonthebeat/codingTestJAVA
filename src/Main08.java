import java.util.Scanner;

public class Main08 {

    /**
     * 유효한 팰린드롬
     * @param str
     * @return
     */
    public String solution(String str){
        String ret = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // Alphabet이 아니면(^)

        String temp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(temp)){
            return "YES";
        }

        return ret;
    };
    // found7, time: study; Yduts; emit, 7Dnuof
    public static void main(String[] args) {
        Main08 main = new Main08();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.solution(str));

    }
}