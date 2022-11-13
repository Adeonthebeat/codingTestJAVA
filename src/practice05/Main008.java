package practice05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * $$$$
 * [응급실] - Queue || class Person || offer(new Person()) || offer(temp)
 */
class Person {
    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
public class Main008 {

    public int solution(int n, int k, int[] patient) {
        int result = 0;

        Queue<Person> Q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            Q.offer(new Person(i, patient[i]));
        }

        while(!Q.isEmpty()){
            // 첫번째 사람
            Person temp = Q.poll();

            for(Person x : Q){
                if(x.priority > temp.priority){
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }
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
3

6 3
70 60 90 60 60 60
4
 */
    public static void main(String[] args) {
        Main008 main = new Main008();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] patient = new int[n];

        for (int i = 0; i < n; i++) {
            patient[i] = input.nextInt();
        }

        System.out.println(main.solution(n, k, patient));

    }

}
