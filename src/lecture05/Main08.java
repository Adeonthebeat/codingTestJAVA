package lecture05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** $$$$
 * [응급실] - Queue || id, priority || Person || offer
 */

class Person {
    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
public class Main08 {

    public int solution(int n, int k, int[] arr){

        int result = 0;

        Queue<Person> Q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            Q.offer(new Person(i, arr[i]));
        }

        while (!Q.isEmpty()){
            // 첫번쨰 사람
            Person temp = Q.poll();
            for(Person x : Q){
                // 숫자가 크다면(우선순위가 낮나면), 뒤로 하고 Null 함
                if(x.priority > temp.priority){
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }
            // 우선순위가 높다면.
            if(temp != null){
                result++;
                if(temp.id == k){
                    return result;
                }
            }
        }
        return result;
    }

    /**
     5 2
     60 50 70 80 90
     ->> 3
     6 3
     70 60 90 60 60 60
     ->> 4
     */

    public static void main(String[] args) {
        Main08 main = new Main08();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 총개수
        int k = input.nextInt(); // Target(몇번째 환자)

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }

}
